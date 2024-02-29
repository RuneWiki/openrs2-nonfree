package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public class Class191 {

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "Z")
	boolean aBoolean567;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!ade;")
	Class77_Sub1_Sub1 aClass77_Sub1_Sub1_1;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!adi;")
	Class78_Sub2 aClass78_Sub2_6;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Lclient!ade;")
	Class77_Sub1_Sub1 aClass77_Sub1_Sub1_2;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
	int anInt3343 = 0;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	int anInt3342 = 0;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
	int anInt3345 = 1;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	int anInt3346 = 1;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Lclient!zm;")
	Class695 aClass695_43 = new Class695();

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "Z")
	boolean aBoolean568 = true;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "Z")
	boolean aBoolean569 = true;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Z")
	boolean aBoolean571 = true;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "Z")
	boolean aBoolean570 = true;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "[Lclient!adi;")
	Class78_Sub2[] aClass78_Sub2Array4 = new Class78_Sub2[2];

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Z")
	boolean aBoolean572 = false;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	int anInt3344 = 0;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Lclient!dl;")
	Class206 aClass206_18 = Class206.aClass206_23;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_45;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "Lclient!aob;")
	Class92_Sub1_Sub1 aClass92_Sub1_Sub1_4;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Lclient!aob;")
	Class92_Sub1_Sub1 aClass92_Sub1_Sub1_6;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "Lclient!aob;")
	Class92_Sub1_Sub1 aClass92_Sub1_Sub1_5;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 32)
	Class191(@OriginalArg(0) Class86_Sub3 arg0) {
		this.aClass86_Sub3_45 = arg0;
		if (this.aClass86_Sub3_45.aBoolean134 && this.aClass86_Sub3_45.aBoolean127) {
			this.aClass92_Sub1_Sub1_6 = this.aClass92_Sub1_Sub1_4 = new Class92_Sub1_Sub1(this.aClass86_Sub3_45);
			if (this.aClass86_Sub3_45.anInt711 > 1 && this.aClass86_Sub3_45.aBoolean125 && this.aClass86_Sub3_45.aBoolean117) {
				this.aClass92_Sub1_Sub1_6 = this.aClass92_Sub1_Sub1_5 = new Class92_Sub1_Sub1(this.aClass86_Sub3_45);
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "()V", line = 41)
	void method24652() {
		this.aClass92_Sub1_Sub1_4 = null;
		this.aClass92_Sub1_Sub1_5 = null;
		this.aClass92_Sub1_Sub1_6 = null;
		this.aClass77_Sub1_Sub1_2 = null;
		this.aClass78_Sub2_6 = null;
		this.aClass78_Sub2Array4 = null;
		this.aClass77_Sub1_Sub1_1 = null;
		if (!this.aClass695_43.method36416()) {
			for (@Pc(30) Class77 local30 = this.aClass695_43.method36395(); local30 != this.aClass695_43.aClass77_223; local30 = local30.aClass77_222) {
				((Class77_Sub11) local30).method21311();
			}
		}
		this.anInt3346 = 1;
		this.anInt3345 = 1;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()Z", line = 58)
	boolean method24653() {
		return this.aClass92_Sub1_Sub1_6 != null;
	}

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "()Z", line = 62)
	boolean method24654() {
		return this.aBoolean567;
	}

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "()Z", line = 62)
	boolean method24655() {
		return this.aBoolean567;
	}

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "()Z", line = 62)
	boolean method24656() {
		return this.aBoolean567;
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "()Z", line = 66)
	boolean method24657() {
		for (@Pc(5) Class77_Sub11 local5 = (Class77_Sub11) this.aClass695_43.method36395(); local5 != null; local5 = (Class77_Sub11) this.aClass695_43.method36406()) {
			if (!local5.method21294()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "()Z", line = 66)
	boolean method24658() {
		for (@Pc(5) Class77_Sub11 local5 = (Class77_Sub11) this.aClass695_43.method36395(); local5 != null; local5 = (Class77_Sub11) this.aClass695_43.method36406()) {
			if (!local5.method21294()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "()Z", line = 66)
	boolean method24659() {
		for (@Pc(5) Class77_Sub11 local5 = (Class77_Sub11) this.aClass695_43.method36395(); local5 != null; local5 = (Class77_Sub11) this.aClass695_43.method36406()) {
			if (!local5.method21294()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "()Z", line = 73)
	boolean method24660() {
		if (this.aBoolean569) {
			if (this.aClass77_Sub1_Sub1_2 != null) {
				this.aClass77_Sub1_Sub1_2.method30322();
				this.aClass77_Sub1_Sub1_2 = null;
			}
			if (this.aClass78_Sub2_6 != null) {
				this.aClass78_Sub2_6.method17466();
				this.aClass78_Sub2_6 = null;
			}
		}
		if (this.aBoolean568) {
			if (this.aClass77_Sub1_Sub1_1 != null) {
				this.aClass77_Sub1_Sub1_1.method30322();
				this.aClass77_Sub1_Sub1_1 = null;
			}
			if (this.aClass78_Sub2Array4[0] != null) {
				this.aClass78_Sub2Array4[0].method17466();
				this.aClass78_Sub2Array4[0] = null;
			}
			if (this.aClass78_Sub2Array4[1] != null) {
				this.aClass78_Sub2Array4[1].method17466();
				this.aClass78_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean569) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			if (this.aBoolean572) {
				this.aClass78_Sub2_6 = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			} else if (this.aClass77_Sub1_Sub1_2 == null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			}
			this.aBoolean569 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean568) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_1 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			this.aClass78_Sub2Array4[0] = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346);
			this.aClass78_Sub2Array4[1] = this.anInt3344 > 1 ? new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346) : null;
			this.aBoolean568 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean571) {
			if (this.aClass92_Sub1_Sub1_5 == null) {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				} else {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass77_Sub1_Sub1_2);
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
			} else {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_5);
				this.aClass92_Sub1_Sub1_5.method23512(null);
				this.aClass92_Sub1_Sub1_5.method23513(0, null);
				this.aClass92_Sub1_Sub1_5.method23513(0, this.aClass77_Sub1_Sub1_1);
				this.aClass92_Sub1_Sub1_5.method23512(this.aClass77_Sub1_Sub1_2);
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			}
			this.aBoolean571 = false;
			this.aBoolean570 = true;
		}
		if (this.aBoolean570) {
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
			this.aBoolean570 = !this.aClass92_Sub1_Sub1_6.method23514();
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_6);
		}
		return !this.aBoolean570;
	}

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "()Z", line = 73)
	boolean method24661() {
		if (this.aBoolean569) {
			if (this.aClass77_Sub1_Sub1_2 != null) {
				this.aClass77_Sub1_Sub1_2.method30322();
				this.aClass77_Sub1_Sub1_2 = null;
			}
			if (this.aClass78_Sub2_6 != null) {
				this.aClass78_Sub2_6.method17466();
				this.aClass78_Sub2_6 = null;
			}
		}
		if (this.aBoolean568) {
			if (this.aClass77_Sub1_Sub1_1 != null) {
				this.aClass77_Sub1_Sub1_1.method30322();
				this.aClass77_Sub1_Sub1_1 = null;
			}
			if (this.aClass78_Sub2Array4[0] != null) {
				this.aClass78_Sub2Array4[0].method17466();
				this.aClass78_Sub2Array4[0] = null;
			}
			if (this.aClass78_Sub2Array4[1] != null) {
				this.aClass78_Sub2Array4[1].method17466();
				this.aClass78_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean569) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			if (this.aBoolean572) {
				this.aClass78_Sub2_6 = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			} else if (this.aClass77_Sub1_Sub1_2 == null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			}
			this.aBoolean569 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean568) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_1 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			this.aClass78_Sub2Array4[0] = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346);
			this.aClass78_Sub2Array4[1] = this.anInt3344 > 1 ? new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346) : null;
			this.aBoolean568 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean571) {
			if (this.aClass92_Sub1_Sub1_5 == null) {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				} else {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass77_Sub1_Sub1_2);
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
			} else {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_5);
				this.aClass92_Sub1_Sub1_5.method23512(null);
				this.aClass92_Sub1_Sub1_5.method23513(0, null);
				this.aClass92_Sub1_Sub1_5.method23513(0, this.aClass77_Sub1_Sub1_1);
				this.aClass92_Sub1_Sub1_5.method23512(this.aClass77_Sub1_Sub1_2);
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			}
			this.aBoolean571 = false;
			this.aBoolean570 = true;
		}
		if (this.aBoolean570) {
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
			this.aBoolean570 = !this.aClass92_Sub1_Sub1_6.method23514();
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_6);
		}
		return !this.aBoolean570;
	}

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "()Z", line = 73)
	boolean method24662() {
		if (this.aBoolean569) {
			if (this.aClass77_Sub1_Sub1_2 != null) {
				this.aClass77_Sub1_Sub1_2.method30322();
				this.aClass77_Sub1_Sub1_2 = null;
			}
			if (this.aClass78_Sub2_6 != null) {
				this.aClass78_Sub2_6.method17466();
				this.aClass78_Sub2_6 = null;
			}
		}
		if (this.aBoolean568) {
			if (this.aClass77_Sub1_Sub1_1 != null) {
				this.aClass77_Sub1_Sub1_1.method30322();
				this.aClass77_Sub1_Sub1_1 = null;
			}
			if (this.aClass78_Sub2Array4[0] != null) {
				this.aClass78_Sub2Array4[0].method17466();
				this.aClass78_Sub2Array4[0] = null;
			}
			if (this.aClass78_Sub2Array4[1] != null) {
				this.aClass78_Sub2Array4[1].method17466();
				this.aClass78_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean569) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			if (this.aBoolean572) {
				this.aClass78_Sub2_6 = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			} else if (this.aClass77_Sub1_Sub1_2 == null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			}
			this.aBoolean569 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean568) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_1 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			this.aClass78_Sub2Array4[0] = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346);
			this.aClass78_Sub2Array4[1] = this.anInt3344 > 1 ? new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346) : null;
			this.aBoolean568 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean571) {
			if (this.aClass92_Sub1_Sub1_5 == null) {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				} else {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass77_Sub1_Sub1_2);
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
			} else {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_5);
				this.aClass92_Sub1_Sub1_5.method23512(null);
				this.aClass92_Sub1_Sub1_5.method23513(0, null);
				this.aClass92_Sub1_Sub1_5.method23513(0, this.aClass77_Sub1_Sub1_1);
				this.aClass92_Sub1_Sub1_5.method23512(this.aClass77_Sub1_Sub1_2);
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			}
			this.aBoolean571 = false;
			this.aBoolean570 = true;
		}
		if (this.aBoolean570) {
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
			this.aBoolean570 = !this.aClass92_Sub1_Sub1_6.method23514();
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_6);
		}
		return !this.aBoolean570;
	}

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "()Z", line = 73)
	boolean method24663() {
		if (this.aBoolean569) {
			if (this.aClass77_Sub1_Sub1_2 != null) {
				this.aClass77_Sub1_Sub1_2.method30322();
				this.aClass77_Sub1_Sub1_2 = null;
			}
			if (this.aClass78_Sub2_6 != null) {
				this.aClass78_Sub2_6.method17466();
				this.aClass78_Sub2_6 = null;
			}
		}
		if (this.aBoolean568) {
			if (this.aClass77_Sub1_Sub1_1 != null) {
				this.aClass77_Sub1_Sub1_1.method30322();
				this.aClass77_Sub1_Sub1_1 = null;
			}
			if (this.aClass78_Sub2Array4[0] != null) {
				this.aClass78_Sub2Array4[0].method17466();
				this.aClass78_Sub2Array4[0] = null;
			}
			if (this.aClass78_Sub2Array4[1] != null) {
				this.aClass78_Sub2Array4[1].method17466();
				this.aClass78_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean569) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			if (this.aBoolean572) {
				this.aClass78_Sub2_6 = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			} else if (this.aClass77_Sub1_Sub1_2 == null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			}
			this.aBoolean569 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean568) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_1 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			this.aClass78_Sub2Array4[0] = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346);
			this.aClass78_Sub2Array4[1] = this.anInt3344 > 1 ? new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346) : null;
			this.aBoolean568 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean571) {
			if (this.aClass92_Sub1_Sub1_5 == null) {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				} else {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass77_Sub1_Sub1_2);
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
			} else {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_5);
				this.aClass92_Sub1_Sub1_5.method23512(null);
				this.aClass92_Sub1_Sub1_5.method23513(0, null);
				this.aClass92_Sub1_Sub1_5.method23513(0, this.aClass77_Sub1_Sub1_1);
				this.aClass92_Sub1_Sub1_5.method23512(this.aClass77_Sub1_Sub1_2);
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			}
			this.aBoolean571 = false;
			this.aBoolean570 = true;
		}
		if (this.aBoolean570) {
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
			this.aBoolean570 = !this.aClass92_Sub1_Sub1_6.method23514();
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_6);
		}
		return !this.aBoolean570;
	}

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "()Z", line = 73)
	boolean method24664() {
		if (this.aBoolean569) {
			if (this.aClass77_Sub1_Sub1_2 != null) {
				this.aClass77_Sub1_Sub1_2.method30322();
				this.aClass77_Sub1_Sub1_2 = null;
			}
			if (this.aClass78_Sub2_6 != null) {
				this.aClass78_Sub2_6.method17466();
				this.aClass78_Sub2_6 = null;
			}
		}
		if (this.aBoolean568) {
			if (this.aClass77_Sub1_Sub1_1 != null) {
				this.aClass77_Sub1_Sub1_1.method30322();
				this.aClass77_Sub1_Sub1_1 = null;
			}
			if (this.aClass78_Sub2Array4[0] != null) {
				this.aClass78_Sub2Array4[0].method17466();
				this.aClass78_Sub2Array4[0] = null;
			}
			if (this.aClass78_Sub2Array4[1] != null) {
				this.aClass78_Sub2Array4[1].method17466();
				this.aClass78_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean569) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			if (this.aBoolean572) {
				this.aClass78_Sub2_6 = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			} else if (this.aClass77_Sub1_Sub1_2 == null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			}
			this.aBoolean569 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean568) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_1 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			this.aClass78_Sub2Array4[0] = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346);
			this.aClass78_Sub2Array4[1] = this.anInt3344 > 1 ? new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346) : null;
			this.aBoolean568 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean571) {
			if (this.aClass92_Sub1_Sub1_5 == null) {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				} else {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass77_Sub1_Sub1_2);
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
			} else {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_5);
				this.aClass92_Sub1_Sub1_5.method23512(null);
				this.aClass92_Sub1_Sub1_5.method23513(0, null);
				this.aClass92_Sub1_Sub1_5.method23513(0, this.aClass77_Sub1_Sub1_1);
				this.aClass92_Sub1_Sub1_5.method23512(this.aClass77_Sub1_Sub1_2);
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			}
			this.aBoolean571 = false;
			this.aBoolean570 = true;
		}
		if (this.aBoolean570) {
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
			this.aBoolean570 = !this.aClass92_Sub1_Sub1_6.method23514();
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_6);
		}
		return !this.aBoolean570;
	}

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "()Z", line = 73)
	boolean method24665() {
		if (this.aBoolean569) {
			if (this.aClass77_Sub1_Sub1_2 != null) {
				this.aClass77_Sub1_Sub1_2.method30322();
				this.aClass77_Sub1_Sub1_2 = null;
			}
			if (this.aClass78_Sub2_6 != null) {
				this.aClass78_Sub2_6.method17466();
				this.aClass78_Sub2_6 = null;
			}
		}
		if (this.aBoolean568) {
			if (this.aClass77_Sub1_Sub1_1 != null) {
				this.aClass77_Sub1_Sub1_1.method30322();
				this.aClass77_Sub1_Sub1_1 = null;
			}
			if (this.aClass78_Sub2Array4[0] != null) {
				this.aClass78_Sub2Array4[0].method17466();
				this.aClass78_Sub2Array4[0] = null;
			}
			if (this.aClass78_Sub2Array4[1] != null) {
				this.aClass78_Sub2Array4[1].method17466();
				this.aClass78_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean569) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			if (this.aBoolean572) {
				this.aClass78_Sub2_6 = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			} else if (this.aClass77_Sub1_Sub1_2 == null) {
				this.aClass77_Sub1_Sub1_2 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_21, Class206.aClass206_21, this.anInt3345, this.anInt3346);
			}
			this.aBoolean569 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean568) {
			if (this.aClass92_Sub1_Sub1_5 != null) {
				this.aClass77_Sub1_Sub1_1 = new Class77_Sub1_Sub1(this.aClass86_Sub3_45, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346, this.aClass86_Sub3_45.anInt711);
			}
			this.aClass78_Sub2Array4[0] = new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346);
			this.aClass78_Sub2Array4[1] = this.anInt3344 > 1 ? new Class78_Sub2(this.aClass86_Sub3_45, 34037, Class212.aClass212_18, this.aClass206_18, this.anInt3345, this.anInt3346) : null;
			this.aBoolean568 = false;
			this.aBoolean571 = true;
			this.aBoolean570 = true;
		}
		if (this.aBoolean571) {
			if (this.aClass92_Sub1_Sub1_5 == null) {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				} else {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass77_Sub1_Sub1_2);
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
			} else {
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
				this.aClass92_Sub1_Sub1_4.method23512(null);
				this.aClass92_Sub1_Sub1_4.method23513(0, null);
				this.aClass92_Sub1_Sub1_4.method23513(1, null);
				this.aClass92_Sub1_Sub1_4.method23513(0, this.aClass78_Sub2Array4[0].method17513(0));
				this.aClass92_Sub1_Sub1_4.method23513(1, this.anInt3344 > 1 ? this.aClass78_Sub2Array4[1].method17513(0) : null);
				if (this.aBoolean572) {
					this.aClass92_Sub1_Sub1_4.method23512(this.aClass78_Sub2_6.method17509(0));
				}
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
				this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_5);
				this.aClass92_Sub1_Sub1_5.method23512(null);
				this.aClass92_Sub1_Sub1_5.method23513(0, null);
				this.aClass92_Sub1_Sub1_5.method23513(0, this.aClass77_Sub1_Sub1_1);
				this.aClass92_Sub1_Sub1_5.method23512(this.aClass77_Sub1_Sub1_2);
				this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			}
			this.aBoolean571 = false;
			this.aBoolean570 = true;
		}
		if (this.aBoolean570) {
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
			this.aBoolean570 = !this.aClass92_Sub1_Sub1_6.method23514();
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_6);
		}
		return !this.aBoolean570;
	}

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "(IIII)Z", line = 153)
	boolean method24666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_Sub1_Sub1_6 == null || this.aClass695_43.method36416() || this.method24658()) {
			return false;
		}
		if (this.anInt3345 != arg2 || this.anInt3346 != arg3) {
			this.anInt3345 = arg2;
			this.anInt3346 = arg3;
			for (@Pc(31) Class77 local31 = this.aClass695_43.method36395(); local31 != this.aClass695_43.aClass77_223; local31 = local31.aClass77_222) {
				((Class77_Sub11) local31).method21288(this.anInt3345, this.anInt3346);
			}
			this.aBoolean568 = true;
			this.aBoolean569 = true;
			this.aBoolean571 = true;
		}
		if (!this.method24661()) {
			return false;
		}
		this.anInt3343 = arg0;
		this.anInt3342 = arg1;
		this.aBoolean567 = true;
		this.aClass86_Sub3_45.method6062(-this.anInt3343, this.anInt3346 + this.anInt3342 - this.aClass86_Sub3_45.method19940().method23493());
		this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
		this.aClass92_Sub1_Sub1_6.method17580(0);
		this.aClass86_Sub3_45.method20125(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(IIII)Z", line = 153)
	boolean method24667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_Sub1_Sub1_6 == null || this.aClass695_43.method36416() || this.method24658()) {
			return false;
		}
		if (this.anInt3345 != arg2 || this.anInt3346 != arg3) {
			this.anInt3345 = arg2;
			this.anInt3346 = arg3;
			for (@Pc(31) Class77 local31 = this.aClass695_43.method36395(); local31 != this.aClass695_43.aClass77_223; local31 = local31.aClass77_222) {
				((Class77_Sub11) local31).method21288(this.anInt3345, this.anInt3346);
			}
			this.aBoolean568 = true;
			this.aBoolean569 = true;
			this.aBoolean571 = true;
		}
		if (!this.method24661()) {
			return false;
		}
		this.anInt3343 = arg0;
		this.anInt3342 = arg1;
		this.aBoolean567 = true;
		this.aClass86_Sub3_45.method6062(-this.anInt3343, this.anInt3346 + this.anInt3342 - this.aClass86_Sub3_45.method19940().method23493());
		this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
		this.aClass92_Sub1_Sub1_6.method17580(0);
		this.aClass86_Sub3_45.method20125(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "(IIII)Z", line = 153)
	boolean method24668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_Sub1_Sub1_6 == null || this.aClass695_43.method36416() || this.method24658()) {
			return false;
		}
		if (this.anInt3345 != arg2 || this.anInt3346 != arg3) {
			this.anInt3345 = arg2;
			this.anInt3346 = arg3;
			for (@Pc(31) Class77 local31 = this.aClass695_43.method36395(); local31 != this.aClass695_43.aClass77_223; local31 = local31.aClass77_222) {
				((Class77_Sub11) local31).method21288(this.anInt3345, this.anInt3346);
			}
			this.aBoolean568 = true;
			this.aBoolean569 = true;
			this.aBoolean571 = true;
		}
		if (!this.method24661()) {
			return false;
		}
		this.anInt3343 = arg0;
		this.anInt3342 = arg1;
		this.aBoolean567 = true;
		this.aClass86_Sub3_45.method6062(-this.anInt3343, this.anInt3346 + this.anInt3342 - this.aClass86_Sub3_45.method19940().method23493());
		this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_6);
		this.aClass92_Sub1_Sub1_6.method17580(0);
		this.aClass86_Sub3_45.method20125(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "(II)V", line = 178)
	void method24669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean567) {
			return;
		}
		if (this.aClass92_Sub1_Sub1_5 != null) {
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
			this.aClass92_Sub1_Sub1_4.method17580(0);
			this.aClass92_Sub1_Sub1_5.method23515(0, 0, this.anInt3345, this.anInt3346, 0, 0, true, this.aBoolean572);
		}
		this.aClass86_Sub3_45.method6171();
		this.aClass86_Sub3_45.method6250(0);
		this.aClass86_Sub3_45.method6198(1);
		this.aClass86_Sub3_45.method20299();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) Class77_Sub11[] local62 = null;
		@Pc(68) Class77_Sub11 local68;
		for (local68 = (Class77_Sub11) this.aClass695_43.method36395(); local68 != null; local68 = (Class77_Sub11) this.aClass695_43.method36406()) {
			if (!local68.method21294()) {
				local58++;
			}
		}
		local62 = new Class77_Sub11[local58];
		local58 = 0;
		for (local68 = (Class77_Sub11) this.aClass695_43.method36395(); local68 != null; local68 = (Class77_Sub11) this.aClass695_43.method36406()) {
			if (!local68.method21294()) {
				local62[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class77_Sub11 local121 = local62[local114];
				if (local121.method21292() == local60) {
					@Pc(128) int local128 = local121.method21272();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass86_Sub3_45.method6062(0, 0);
						local121.method21312(local130, this.aClass78_Sub2Array4[local52], this.aClass78_Sub2_6, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3343, this.anInt3342);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3343, this.anInt3342 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3343 + arg0, this.anInt3342 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3343 + arg0, this.anInt3342);
							OpenGL.glEnd();
						} else {
							this.aClass92_Sub1_Sub1_4.method17580(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method21289(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean567 = false;
		local62 = null;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V", line = 178)
	void method24670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean567) {
			return;
		}
		if (this.aClass92_Sub1_Sub1_5 != null) {
			this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_5);
			this.aClass86_Sub3_45.method19968(this.aClass92_Sub1_Sub1_4);
			this.aClass92_Sub1_Sub1_4.method17580(0);
			this.aClass92_Sub1_Sub1_5.method23515(0, 0, this.anInt3345, this.anInt3346, 0, 0, true, this.aBoolean572);
		}
		this.aClass86_Sub3_45.method6171();
		this.aClass86_Sub3_45.method6250(0);
		this.aClass86_Sub3_45.method6198(1);
		this.aClass86_Sub3_45.method20299();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) Class77_Sub11[] local62 = null;
		@Pc(68) Class77_Sub11 local68;
		for (local68 = (Class77_Sub11) this.aClass695_43.method36395(); local68 != null; local68 = (Class77_Sub11) this.aClass695_43.method36406()) {
			if (!local68.method21294()) {
				local58++;
			}
		}
		local62 = new Class77_Sub11[local58];
		local58 = 0;
		for (local68 = (Class77_Sub11) this.aClass695_43.method36395(); local68 != null; local68 = (Class77_Sub11) this.aClass695_43.method36406()) {
			if (!local68.method21294()) {
				local62[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class77_Sub11 local121 = local62[local114];
				if (local121.method21292() == local60) {
					@Pc(128) int local128 = local121.method21272();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass86_Sub3_45.method6062(0, 0);
						local121.method21312(local130, this.aClass78_Sub2Array4[local52], this.aClass78_Sub2_6, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass86_Sub3_45.method19972(this.aClass92_Sub1_Sub1_4);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3343, this.anInt3342);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3343, this.anInt3342 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3343 + arg0, this.anInt3342 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3343 + arg0, this.anInt3342);
							OpenGL.glEnd();
						} else {
							this.aClass92_Sub1_Sub1_4.method17580(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3346 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3346);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method21289(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean567 = false;
		local62 = null;
	}

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "(Lclient!ajj;)Z", line = 261)
	boolean method24671(@OriginalArg(0) Class77_Sub11 arg0) {
		if (this.aClass92_Sub1_Sub1_6 != null) {
			if (arg0.method21286() || arg0.method21285()) {
				this.aClass695_43.method36383(arg0);
				this.method24678();
				if (arg0.method21292() >= 0 && this.method24661()) {
					if (this.anInt3345 != -1 && this.anInt3346 != -1) {
						arg0.method21288(this.anInt3345, this.anInt3346);
					}
					arg0.aBoolean487 = true;
					return true;
				}
			}
			this.method24674(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "(Lclient!ajj;)Z", line = 261)
	boolean method24672(@OriginalArg(0) Class77_Sub11 arg0) {
		if (this.aClass92_Sub1_Sub1_6 != null) {
			if (arg0.method21286() || arg0.method21285()) {
				this.aClass695_43.method36383(arg0);
				this.method24678();
				if (arg0.method21292() >= 0 && this.method24661()) {
					if (this.anInt3345 != -1 && this.anInt3346 != -1) {
						arg0.method21288(this.anInt3345, this.anInt3346);
					}
					arg0.aBoolean487 = true;
					return true;
				}
			}
			this.method24674(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ajj;)V", line = 279)
	void method24673(@OriginalArg(0) Class77_Sub11 arg0) {
		arg0.aBoolean487 = false;
		arg0.method21311();
		arg0.method24063();
		this.method24678();
	}

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "(Lclient!ajj;)V", line = 279)
	void method24674(@OriginalArg(0) Class77_Sub11 arg0) {
		arg0.aBoolean487 = false;
		arg0.method21311();
		arg0.method24063();
		this.method24678();
	}

	@OriginalMember(owner = "client!cl", name = "aj", descriptor = "(Lclient!ajj;)V", line = 279)
	void method24675(@OriginalArg(0) Class77_Sub11 arg0) {
		arg0.aBoolean487 = false;
		arg0.method21311();
		arg0.method24063();
		this.method24678();
	}

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "(Lclient!ajj;)V", line = 279)
	void method24676(@OriginalArg(0) Class77_Sub11 arg0) {
		arg0.aBoolean487 = false;
		arg0.method21311();
		arg0.method24063();
		this.method24678();
	}

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "(Lclient!ajj;)V", line = 279)
	void method24677(@OriginalArg(0) Class77_Sub11 arg0) {
		arg0.aBoolean487 = false;
		arg0.method21311();
		arg0.method24063();
		this.method24678();
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "()V", line = 286)
	void method24678() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class206 local5 = Class206.aClass206_23;
		for (@Pc(11) Class77_Sub11 local11 = (Class77_Sub11) this.aClass695_43.method36395(); local11 != null; local11 = (Class77_Sub11) this.aClass695_43.method36406()) {
			@Pc(16) Class206 local16 = local11.method21278();
			if (local16.anInt3581 * 1899960707 > local5.anInt3581 * 1899960707) {
				local5 = local16;
			}
			local3 |= local11.method21274();
			local1 += local11.method21272();
		}
		if (local5 != this.aClass206_18) {
			this.aClass206_18 = local5;
			this.aBoolean568 = true;
		}
		@Pc(63) int local63 = this.anInt3344 > 2 ? 2 : this.anInt3344;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean568 = true;
			this.aBoolean571 = true;
		}
		if (local3 != this.aBoolean572) {
			this.aBoolean572 = local3;
			this.aBoolean569 = true;
		}
		this.anInt3344 = local1;
	}
}
