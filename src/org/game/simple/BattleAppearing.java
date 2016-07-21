package org.game.simple;

import java.awt.Graphics;
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
public class BattleAppearing {

	static float x = 205F;

	static float y = 572F;

	private static boolean sound = true;

	public BattleAppearing() {
	}

	public static void draw(Graphics g) {
		if (sound) {
			sound = false;
		}
		if (y > 428F)
			g.drawImage(GamePanel.heroImage, (int) x, (int) y, null);
		else if (y <= 428F) {
			GamePanel.AppearingFlag = false;
			x = 205F;
			y = 572F;
			sound = true;
		}
		y -= 2.0F;
	}

}
