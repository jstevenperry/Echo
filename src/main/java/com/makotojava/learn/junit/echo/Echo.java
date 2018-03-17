/*
 * Copyright 2018 Makoto Consulting Group Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.makotojava.learn.junit.echo;

/**
 * A simple echo program, because what the world really needs is another
 * simple program.
 * 
 * Seriously though, this program exists just so it can be tested, and that
 * its implementation is easily understood (so the implementation details
 * don't get in the way of the testing aspect).
 * 
 * @author J Steven Perry
 *
 */
public class Echo {
  public String echo(String stringToEcho) {
    return stringToEcho;
  }

  public Integer echo(int intToEcho) {
    return intToEcho;
  }
}
