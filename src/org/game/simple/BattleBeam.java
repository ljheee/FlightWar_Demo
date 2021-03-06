package org.game.simple;
/**
 * 
 * Copyright 2008 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * @project org.game.simple
 * @author chenpeng  
 * @email��ceponline@yahoo.com.cn 
 * @version 0.1
 */
public class BattleBeam extends BattleShot {

	public BattleBeam(float x, float y, float vx, float vy) {
		super(x, y, vx, vy, GamePanel.zikiBeamImage);
	}

	public void move() {
		if (Key.xkey) {
			x += vx + Battle.vx;
			y += vy + Battle.vy;
		} else {
			x += vx;
			y += vy;
		}
		if (x + WIDTH < 0.0F || x > (float) app.getWidth() || y + HEIGHT < 0.0F
				|| y > (float) app.getHeight())
			dead();
	}
}
