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
public class Burst extends Thread {
	private float x;

	private float y;

	private int count;

	private int MAX=0;
	
	public Burst(float x, float y) {
		this.x = x;
		this.y = y;
		count = 0;
		MAX=GamePanel.burstImage.length;
		start();
	}

	public void run() {
		do {
			count++;
			if (count == MAX)
				return;
			try {
				Thread.sleep(20L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}

	public void draw(Graphics g) {
		if (count < MAX){
			g.drawImage(GamePanel.burstImage[count], (int) x, (int) y, null);
		}
	}

}
