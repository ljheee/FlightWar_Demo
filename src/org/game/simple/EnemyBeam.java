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
 * @email£ºceponline@yahoo.com.cn 
 * @version 0.1
 */
public class EnemyBeam extends EnemyShot {

	public EnemyBeam(float x, float y, Battle ziki, Enemy enemy) {
		super(x, y, GamePanel.enemyBeamImage);
		this.ziki = ziki;
		this.enemy = enemy;
		vx = 0.0F;
		vy = 3F;
	}

	public void move() {
		x += vx + enemy.vx;
		y += vy + enemy.vy;
		if (x + WIDTH < 0.0F || x > (float) app.getWidth() || y + HEIGHT < 0.0F
				|| y > (float) app.getHeight())
			dead();
	}

	Battle ziki;

	Enemy enemy;
}
