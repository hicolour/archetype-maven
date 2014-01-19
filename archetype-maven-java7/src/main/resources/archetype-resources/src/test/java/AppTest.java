package $package;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

public class AppTest {

    final App app = new App();

    @Before
    public void init() {
        initMocks(this);
    }

    @Test
    public void can() {
        assertThat(app, notNullValue());
    }
}

