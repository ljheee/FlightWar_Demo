package org.game.simple;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class Key extends KeyAdapter {

	static boolean left;

	static boolean right;

	static boolean up;

	static boolean down;

	static boolean zkey;

	static boolean xkey;

	static boolean escape;

	static boolean enter;

	public Key() {
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37:
			left = true;
			break;

		case 39:
			right = true;
			break;

		case 38:
			up = true;
			break;

		case 40:
			down = true;
			break;

		case 90:
			zkey = true;
			break;

		case 88:
			xkey = true;
			break;

		case 27:
			escape = true;
			break;

		case 10:
			enter = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37:
			left = false;
			break;

		case 39:
			right = false;
			break;

		case 38:
			up = false;
			break;

		case 40:
			down = false;
			break;

		case 90:
			zkey = false;
			break;

		case 88:
			xkey = false;
			break;

		case 10:
			enter = false;
			break;
		}
	}

}
