/*
 * Copyright 2013 - 2014 The Original Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elasticsoftware.elasticactors.geoevents.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsoftware.elasticactors.base.serialization.ObjectMapperBuilder;
import org.elasticsoftware.elasticactors.cluster.ActorRefFactory;
import org.elasticsoftware.elasticactors.cluster.scheduler.ScheduledMessageRefFactory;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertNotNull;

/**
 * @author Joost van de Wijgerd
 */
public class ObjectMapperBuilderTest {
    @Test
    public void testBuildObjectMapper() {
        ActorRefFactory actorRefFactory = mock(ActorRefFactory.class);
        ScheduledMessageRefFactory scheduledMessageRefFactory = mock(ScheduledMessageRefFactory.class);
        ObjectMapper objectMapper = new ObjectMapperBuilder(actorRefFactory,scheduledMessageRefFactory,"1.0.0").build();
        // check if everything was scanned correctly
        assertNotNull(objectMapper);

    }
}
