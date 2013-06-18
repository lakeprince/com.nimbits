/*
 * Copyright (c) 2010 Nimbits Inc.
 *
 * http://www.nimbits.com
 *
 *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the license is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, eitherexpress or implied. See the License for the specific language governing permissions and limitations under the License.
 */

/**
	@class
	@inherits Bar#zop as #my_zop
*/
function Foo() {
	/** this is a zip. */
	this.zip = function() {}

	/** from Bar */
	this.my_zop = new Bar().zop;
}

/**
	@class
	@borrows Foo#zip as this.my_zip
*/
function Bar() {
	/** this is a zop. */
	this.zop = function() {}

	/** from Foo */
	this.my_zip = new Foo().zip;
}

/** @namespace */
var myObject = {
	/**
		@type function
	*/
	myFunc: getFunction()
}