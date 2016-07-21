package org.game.simple;

import java.awt.Graphics;
import java.awt.Image;
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
public abstract class Role {
	protected static GamePanel app;

	protected Image img;

	protected float x;

	protected float y;

	protected float WIDTH;

	protected float HEIGHT;

	private boolean dead;

	protected Role(Image img) {
		this.img = img;
		WIDTH = img.getWidth(app);
		HEIGHT = img.getHeight(app);
		dead = false;
	}

	public boolean isDead() {
		return dead;
	}

	public void dead() {
		dead = true;
	}

	abstract void move();

	protected boolean checkHit(Role chara) {
		return x > chara.x - WIDTH && x < chara.x + chara.WIDTH
				&& y > chara.y - HEIGHT && y < chara.y + chara.HEIGHT;
	}

	public void draw(Graphics g) {
		g.drawImage(img, (int) x, (int) y, app);
	}

	public void drawBurst(Graphics g) {
		g.drawImage(GamePanel.burstImage[0], (int) x, (int) y, app);
	}

}
