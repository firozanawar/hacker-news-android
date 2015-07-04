package io.dwak.holohackernews.app.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import io.dwak.holohackernews.app.dagger.module.HackerNewsServiceModule;
import io.dwak.holohackernews.app.ui.storydetail.StoryDetailViewModel;
import io.dwak.holohackernews.app.ui.storylist.StoryListViewModel;

@Singleton
@Component(dependencies = AppComponent.class,
           modules = {HackerNewsServiceModule.class})
public interface HackerNewsServiceComponent {
    void inject(StoryListViewModel viewModel);

    void inject(StoryDetailViewModel viewModel);
}
