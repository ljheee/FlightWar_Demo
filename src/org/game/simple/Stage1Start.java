package org.game.simple;

import java.awt.Color;
import java.awt.Font;
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
 * @email：ceponline@yahoo.com.cn 
 * @version 0.1
 */
public class Stage1Start {

	private static int count = 0;

	public Stage1Start() {
	}

	public static void draw(Graphics g) {
		if (count <= 50) {
			g.setColor(Color.white);
			Font font = new Font("黑体", 1, 28);
			g.setFont(font);
			g.drawString("第一关", 100, 250);
		} else if (50 < count && count < 200) {
			g.setColor(Color.white);
			g.drawString("START1", 100, 250);
		} else {
			GamePanel.gameMode = 1;
		}
		count++;
	}

}
