package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public class Class113 {

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "Z")
	boolean aBoolean544;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Lclient!aaa;")
	Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "Lclient!aab;")
	Class4_Sub1 aClass4_Sub1_6;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "Lclient!aaa;")
	Class3_Sub1_Sub1 aClass3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	int anInt3000 = 0;

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
	int anInt2998 = 0;

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
	int anInt3001 = 1;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	int anInt2999 = 1;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Lclient!wk;")
	Class553 aClass553_42 = new Class553();

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Z")
	boolean aBoolean543 = true;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "Z")
	boolean aBoolean545 = true;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "Z")
	boolean aBoolean546 = true;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Z")
	boolean aBoolean547 = true;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "[Lclient!aab;")
	Class4_Sub1[] aClass4_Sub1Array4 = new Class4_Sub1[2];

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
	boolean aBoolean548 = false;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
	int anInt3002 = 0;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "Lclient!dj;")
	Class127 aClass127_17 = Class127.aClass127_23;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_45;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "Lclient!aky;")
	Class19_Sub1_Sub3 aClass19_Sub1_Sub3_6;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!aky;")
	Class19_Sub1_Sub3 aClass19_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!aky;")
	Class19_Sub1_Sub3 aClass19_Sub1_Sub3_4;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!abt;)V", line = 32)
	Class113(@OriginalArg(0) Class21_Sub2 arg0) {
		this.aClass21_Sub2_45 = arg0;
		if (this.aClass21_Sub2_45.aBoolean77 && this.aClass21_Sub2_45.aBoolean86) {
			this.aClass19_Sub1_Sub3_5 = this.aClass19_Sub1_Sub3_6 = new Class19_Sub1_Sub3(this.aClass21_Sub2_45);
			if (this.aClass21_Sub2_45.anInt404 > 1 && this.aClass21_Sub2_45.aBoolean72 && this.aClass21_Sub2_45.aBoolean78) {
				this.aClass19_Sub1_Sub3_5 = this.aClass19_Sub1_Sub3_4 = new Class19_Sub1_Sub3(this.aClass21_Sub2_45);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "()V", line = 41)
	void method22032() {
		this.aClass19_Sub1_Sub3_6 = null;
		this.aClass19_Sub1_Sub3_4 = null;
		this.aClass19_Sub1_Sub3_5 = null;
		this.aClass3_Sub1_Sub1_2 = null;
		this.aClass4_Sub1_6 = null;
		this.aClass4_Sub1Array4 = null;
		this.aClass3_Sub1_Sub1_1 = null;
		if (!this.aClass553_42.method32712()) {
			for (@Pc(30) Class3 local30 = this.aClass553_42.method32768(); local30 != this.aClass553_42.aClass3_238; local30 = local30.aClass3_246) {
				((Class3_Sub9) local30).method18588();
			}
		}
		this.anInt2999 = 1;
		this.anInt3001 = 1;
	}

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "()V", line = 41)
	void method22039() {
		this.aClass19_Sub1_Sub3_6 = null;
		this.aClass19_Sub1_Sub3_4 = null;
		this.aClass19_Sub1_Sub3_5 = null;
		this.aClass3_Sub1_Sub1_2 = null;
		this.aClass4_Sub1_6 = null;
		this.aClass4_Sub1Array4 = null;
		this.aClass3_Sub1_Sub1_1 = null;
		if (!this.aClass553_42.method32712()) {
			for (@Pc(30) Class3 local30 = this.aClass553_42.method32768(); local30 != this.aClass553_42.aClass3_238; local30 = local30.aClass3_246) {
				((Class3_Sub9) local30).method18588();
			}
		}
		this.anInt2999 = 1;
		this.anInt3001 = 1;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "()V", line = 41)
	void method22042() {
		this.aClass19_Sub1_Sub3_6 = null;
		this.aClass19_Sub1_Sub3_4 = null;
		this.aClass19_Sub1_Sub3_5 = null;
		this.aClass3_Sub1_Sub1_2 = null;
		this.aClass4_Sub1_6 = null;
		this.aClass4_Sub1Array4 = null;
		this.aClass3_Sub1_Sub1_1 = null;
		if (!this.aClass553_42.method32712()) {
			for (@Pc(30) Class3 local30 = this.aClass553_42.method32768(); local30 != this.aClass553_42.aClass3_238; local30 = local30.aClass3_246) {
				((Class3_Sub9) local30).method18588();
			}
		}
		this.anInt2999 = 1;
		this.anInt3001 = 1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()Z", line = 58)
	boolean method22033() {
		return this.aClass19_Sub1_Sub3_5 != null;
	}

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "()Z", line = 58)
	boolean method22044() {
		return this.aClass19_Sub1_Sub3_5 != null;
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "()Z", line = 58)
	boolean method22045() {
		return this.aClass19_Sub1_Sub3_5 != null;
	}

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "()Z", line = 58)
	boolean method22057() {
		return this.aClass19_Sub1_Sub3_5 != null;
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "()Z", line = 62)
	boolean method22034() {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "()Z", line = 62)
	boolean method22046() {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "()Z", line = 62)
	boolean method22047() {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "()Z", line = 66)
	boolean method22035() {
		for (@Pc(5) Class3_Sub9 local5 = (Class3_Sub9) this.aClass553_42.method32768(); local5 != null; local5 = (Class3_Sub9) this.aClass553_42.method32709()) {
			if (!local5.method18597()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "()Z", line = 73)
	boolean method22040() {
		if (this.aBoolean545) {
			if (this.aClass3_Sub1_Sub1_2 != null) {
				this.aClass3_Sub1_Sub1_2.method27209();
				this.aClass3_Sub1_Sub1_2 = null;
			}
			if (this.aClass4_Sub1_6 != null) {
				this.aClass4_Sub1_6.method33739();
				this.aClass4_Sub1_6 = null;
			}
		}
		if (this.aBoolean543) {
			if (this.aClass3_Sub1_Sub1_1 != null) {
				this.aClass3_Sub1_Sub1_1.method27209();
				this.aClass3_Sub1_Sub1_1 = null;
			}
			if (this.aClass4_Sub1Array4[0] != null) {
				this.aClass4_Sub1Array4[0].method33739();
				this.aClass4_Sub1Array4[0] = null;
			}
			if (this.aClass4_Sub1Array4[1] != null) {
				this.aClass4_Sub1Array4[1].method33739();
				this.aClass4_Sub1Array4[1] = null;
			}
		}
		if (this.aBoolean545) {
			if (this.aClass19_Sub1_Sub3_4 != null) {
				this.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999, this.aClass21_Sub2_45.anInt404);
			}
			if (this.aBoolean548) {
				this.aClass4_Sub1_6 = new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999);
			} else if (this.aClass3_Sub1_Sub1_2 == null) {
				this.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999);
			}
			this.aBoolean545 = false;
			this.aBoolean546 = true;
			this.aBoolean547 = true;
		}
		if (this.aBoolean543) {
			if (this.aClass19_Sub1_Sub3_4 != null) {
				this.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999, this.aClass21_Sub2_45.anInt404);
			}
			this.aClass4_Sub1Array4[0] = new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999);
			this.aClass4_Sub1Array4[1] = this.anInt3002 > 1 ? new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999) : null;
			this.aBoolean543 = false;
			this.aBoolean546 = true;
			this.aBoolean547 = true;
		}
		if (this.aBoolean546) {
			if (this.aClass19_Sub1_Sub3_4 == null) {
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
				this.aClass19_Sub1_Sub3_6.method20880(null);
				this.aClass19_Sub1_Sub3_6.method20882(0, null);
				this.aClass19_Sub1_Sub3_6.method20882(1, null);
				this.aClass19_Sub1_Sub3_6.method20882(0, this.aClass4_Sub1Array4[0].method14078(0));
				this.aClass19_Sub1_Sub3_6.method20882(1, this.anInt3002 > 1 ? this.aClass4_Sub1Array4[1].method14078(0) : null);
				if (this.aBoolean548) {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass4_Sub1_6.method14077(0));
				} else {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass3_Sub1_Sub1_2);
				}
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
			} else {
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
				this.aClass19_Sub1_Sub3_6.method20880(null);
				this.aClass19_Sub1_Sub3_6.method20882(0, null);
				this.aClass19_Sub1_Sub3_6.method20882(1, null);
				this.aClass19_Sub1_Sub3_6.method20882(0, this.aClass4_Sub1Array4[0].method14078(0));
				this.aClass19_Sub1_Sub3_6.method20882(1, this.anInt3002 > 1 ? this.aClass4_Sub1Array4[1].method14078(0) : null);
				if (this.aBoolean548) {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass4_Sub1_6.method14077(0));
				}
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_4);
				this.aClass19_Sub1_Sub3_4.method20880(null);
				this.aClass19_Sub1_Sub3_4.method20882(0, null);
				this.aClass19_Sub1_Sub3_4.method20882(0, this.aClass3_Sub1_Sub1_1);
				this.aClass19_Sub1_Sub3_4.method20880(this.aClass3_Sub1_Sub1_2);
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_4);
			}
			this.aBoolean546 = false;
			this.aBoolean547 = true;
		}
		if (this.aBoolean547) {
			this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
			this.aBoolean547 = !this.aClass19_Sub1_Sub3_5.method20883();
			this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_5);
		}
		return !this.aBoolean547;
	}

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "()Z", line = 73)
	boolean method22048() {
		if (this.aBoolean545) {
			if (this.aClass3_Sub1_Sub1_2 != null) {
				this.aClass3_Sub1_Sub1_2.method27209();
				this.aClass3_Sub1_Sub1_2 = null;
			}
			if (this.aClass4_Sub1_6 != null) {
				this.aClass4_Sub1_6.method33739();
				this.aClass4_Sub1_6 = null;
			}
		}
		if (this.aBoolean543) {
			if (this.aClass3_Sub1_Sub1_1 != null) {
				this.aClass3_Sub1_Sub1_1.method27209();
				this.aClass3_Sub1_Sub1_1 = null;
			}
			if (this.aClass4_Sub1Array4[0] != null) {
				this.aClass4_Sub1Array4[0].method33739();
				this.aClass4_Sub1Array4[0] = null;
			}
			if (this.aClass4_Sub1Array4[1] != null) {
				this.aClass4_Sub1Array4[1].method33739();
				this.aClass4_Sub1Array4[1] = null;
			}
		}
		if (this.aBoolean545) {
			if (this.aClass19_Sub1_Sub3_4 != null) {
				this.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999, this.aClass21_Sub2_45.anInt404);
			}
			if (this.aBoolean548) {
				this.aClass4_Sub1_6 = new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999);
			} else if (this.aClass3_Sub1_Sub1_2 == null) {
				this.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999);
			}
			this.aBoolean545 = false;
			this.aBoolean546 = true;
			this.aBoolean547 = true;
		}
		if (this.aBoolean543) {
			if (this.aClass19_Sub1_Sub3_4 != null) {
				this.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999, this.aClass21_Sub2_45.anInt404);
			}
			this.aClass4_Sub1Array4[0] = new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999);
			this.aClass4_Sub1Array4[1] = this.anInt3002 > 1 ? new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999) : null;
			this.aBoolean543 = false;
			this.aBoolean546 = true;
			this.aBoolean547 = true;
		}
		if (this.aBoolean546) {
			if (this.aClass19_Sub1_Sub3_4 == null) {
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
				this.aClass19_Sub1_Sub3_6.method20880(null);
				this.aClass19_Sub1_Sub3_6.method20882(0, null);
				this.aClass19_Sub1_Sub3_6.method20882(1, null);
				this.aClass19_Sub1_Sub3_6.method20882(0, this.aClass4_Sub1Array4[0].method14078(0));
				this.aClass19_Sub1_Sub3_6.method20882(1, this.anInt3002 > 1 ? this.aClass4_Sub1Array4[1].method14078(0) : null);
				if (this.aBoolean548) {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass4_Sub1_6.method14077(0));
				} else {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass3_Sub1_Sub1_2);
				}
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
			} else {
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
				this.aClass19_Sub1_Sub3_6.method20880(null);
				this.aClass19_Sub1_Sub3_6.method20882(0, null);
				this.aClass19_Sub1_Sub3_6.method20882(1, null);
				this.aClass19_Sub1_Sub3_6.method20882(0, this.aClass4_Sub1Array4[0].method14078(0));
				this.aClass19_Sub1_Sub3_6.method20882(1, this.anInt3002 > 1 ? this.aClass4_Sub1Array4[1].method14078(0) : null);
				if (this.aBoolean548) {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass4_Sub1_6.method14077(0));
				}
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_4);
				this.aClass19_Sub1_Sub3_4.method20880(null);
				this.aClass19_Sub1_Sub3_4.method20882(0, null);
				this.aClass19_Sub1_Sub3_4.method20882(0, this.aClass3_Sub1_Sub1_1);
				this.aClass19_Sub1_Sub3_4.method20880(this.aClass3_Sub1_Sub1_2);
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_4);
			}
			this.aBoolean546 = false;
			this.aBoolean547 = true;
		}
		if (this.aBoolean547) {
			this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
			this.aBoolean547 = !this.aClass19_Sub1_Sub3_5.method20883();
			this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_5);
		}
		return !this.aBoolean547;
	}

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "()Z", line = 73)
	boolean method22049() {
		if (this.aBoolean545) {
			if (this.aClass3_Sub1_Sub1_2 != null) {
				this.aClass3_Sub1_Sub1_2.method27209();
				this.aClass3_Sub1_Sub1_2 = null;
			}
			if (this.aClass4_Sub1_6 != null) {
				this.aClass4_Sub1_6.method33739();
				this.aClass4_Sub1_6 = null;
			}
		}
		if (this.aBoolean543) {
			if (this.aClass3_Sub1_Sub1_1 != null) {
				this.aClass3_Sub1_Sub1_1.method27209();
				this.aClass3_Sub1_Sub1_1 = null;
			}
			if (this.aClass4_Sub1Array4[0] != null) {
				this.aClass4_Sub1Array4[0].method33739();
				this.aClass4_Sub1Array4[0] = null;
			}
			if (this.aClass4_Sub1Array4[1] != null) {
				this.aClass4_Sub1Array4[1].method33739();
				this.aClass4_Sub1Array4[1] = null;
			}
		}
		if (this.aBoolean545) {
			if (this.aClass19_Sub1_Sub3_4 != null) {
				this.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999, this.aClass21_Sub2_45.anInt404);
			}
			if (this.aBoolean548) {
				this.aClass4_Sub1_6 = new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999);
			} else if (this.aClass3_Sub1_Sub1_2 == null) {
				this.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_21, Class127.aClass127_22, this.anInt3001, this.anInt2999);
			}
			this.aBoolean545 = false;
			this.aBoolean546 = true;
			this.aBoolean547 = true;
		}
		if (this.aBoolean543) {
			if (this.aClass19_Sub1_Sub3_4 != null) {
				this.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1(this.aClass21_Sub2_45, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999, this.aClass21_Sub2_45.anInt404);
			}
			this.aClass4_Sub1Array4[0] = new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999);
			this.aClass4_Sub1Array4[1] = this.anInt3002 > 1 ? new Class4_Sub1(this.aClass21_Sub2_45, 34037, Class121.aClass121_17, this.aClass127_17, this.anInt3001, this.anInt2999) : null;
			this.aBoolean543 = false;
			this.aBoolean546 = true;
			this.aBoolean547 = true;
		}
		if (this.aBoolean546) {
			if (this.aClass19_Sub1_Sub3_4 == null) {
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
				this.aClass19_Sub1_Sub3_6.method20880(null);
				this.aClass19_Sub1_Sub3_6.method20882(0, null);
				this.aClass19_Sub1_Sub3_6.method20882(1, null);
				this.aClass19_Sub1_Sub3_6.method20882(0, this.aClass4_Sub1Array4[0].method14078(0));
				this.aClass19_Sub1_Sub3_6.method20882(1, this.anInt3002 > 1 ? this.aClass4_Sub1Array4[1].method14078(0) : null);
				if (this.aBoolean548) {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass4_Sub1_6.method14077(0));
				} else {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass3_Sub1_Sub1_2);
				}
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
			} else {
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
				this.aClass19_Sub1_Sub3_6.method20880(null);
				this.aClass19_Sub1_Sub3_6.method20882(0, null);
				this.aClass19_Sub1_Sub3_6.method20882(1, null);
				this.aClass19_Sub1_Sub3_6.method20882(0, this.aClass4_Sub1Array4[0].method14078(0));
				this.aClass19_Sub1_Sub3_6.method20882(1, this.anInt3002 > 1 ? this.aClass4_Sub1Array4[1].method14078(0) : null);
				if (this.aBoolean548) {
					this.aClass19_Sub1_Sub3_6.method20880(this.aClass4_Sub1_6.method14077(0));
				}
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
				this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_4);
				this.aClass19_Sub1_Sub3_4.method20880(null);
				this.aClass19_Sub1_Sub3_4.method20882(0, null);
				this.aClass19_Sub1_Sub3_4.method20882(0, this.aClass3_Sub1_Sub1_1);
				this.aClass19_Sub1_Sub3_4.method20880(this.aClass3_Sub1_Sub1_2);
				this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_4);
			}
			this.aBoolean546 = false;
			this.aBoolean547 = true;
		}
		if (this.aBoolean547) {
			this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
			this.aBoolean547 = !this.aClass19_Sub1_Sub3_5.method20883();
			this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_5);
		}
		return !this.aBoolean547;
	}

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "(IIII)Z", line = 153)
	boolean method22037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_Sub1_Sub3_5 == null || this.aClass553_42.method32712() || this.method22035()) {
			return false;
		}
		if (this.anInt3001 != arg2 || this.anInt2999 != arg3) {
			this.anInt3001 = arg2;
			this.anInt2999 = arg3;
			for (@Pc(31) Class3 local31 = this.aClass553_42.method32768(); local31 != this.aClass553_42.aClass3_238; local31 = local31.aClass3_246) {
				((Class3_Sub9) local31).method18613(this.anInt3001, this.anInt2999);
			}
			this.aBoolean543 = true;
			this.aBoolean545 = true;
			this.aBoolean546 = true;
		}
		if (!this.method22040()) {
			return false;
		}
		this.anInt3000 = arg0;
		this.anInt2998 = arg1;
		this.aBoolean544 = true;
		this.aClass21_Sub2_45.method4034(-this.anInt3000, this.anInt2999 + this.anInt2998 - this.aClass21_Sub2_45.method17037().method21391());
		this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
		this.aClass21_Sub2_45.method17061(3, 0);
		this.aClass19_Sub1_Sub3_5.method17949(0);
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "(IIII)Z", line = 153)
	boolean method22050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_Sub1_Sub3_5 == null || this.aClass553_42.method32712() || this.method22035()) {
			return false;
		}
		if (this.anInt3001 != arg2 || this.anInt2999 != arg3) {
			this.anInt3001 = arg2;
			this.anInt2999 = arg3;
			for (@Pc(31) Class3 local31 = this.aClass553_42.method32768(); local31 != this.aClass553_42.aClass3_238; local31 = local31.aClass3_246) {
				((Class3_Sub9) local31).method18613(this.anInt3001, this.anInt2999);
			}
			this.aBoolean543 = true;
			this.aBoolean545 = true;
			this.aBoolean546 = true;
		}
		if (!this.method22040()) {
			return false;
		}
		this.anInt3000 = arg0;
		this.anInt2998 = arg1;
		this.aBoolean544 = true;
		this.aClass21_Sub2_45.method4034(-this.anInt3000, this.anInt2999 + this.anInt2998 - this.aClass21_Sub2_45.method17037().method21391());
		this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
		this.aClass21_Sub2_45.method17061(3, 0);
		this.aClass19_Sub1_Sub3_5.method17949(0);
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "(IIII)Z", line = 153)
	boolean method22051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_Sub1_Sub3_5 == null || this.aClass553_42.method32712() || this.method22035()) {
			return false;
		}
		if (this.anInt3001 != arg2 || this.anInt2999 != arg3) {
			this.anInt3001 = arg2;
			this.anInt2999 = arg3;
			for (@Pc(31) Class3 local31 = this.aClass553_42.method32768(); local31 != this.aClass553_42.aClass3_238; local31 = local31.aClass3_246) {
				((Class3_Sub9) local31).method18613(this.anInt3001, this.anInt2999);
			}
			this.aBoolean543 = true;
			this.aBoolean545 = true;
			this.aBoolean546 = true;
		}
		if (!this.method22040()) {
			return false;
		}
		this.anInt3000 = arg0;
		this.anInt2998 = arg1;
		this.aBoolean544 = true;
		this.aClass21_Sub2_45.method4034(-this.anInt3000, this.anInt2999 + this.anInt2998 - this.aClass21_Sub2_45.method17037().method21391());
		this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
		this.aClass21_Sub2_45.method17061(3, 0);
		this.aClass19_Sub1_Sub3_5.method17949(0);
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "(IIII)Z", line = 153)
	boolean method22052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_Sub1_Sub3_5 == null || this.aClass553_42.method32712() || this.method22035()) {
			return false;
		}
		if (this.anInt3001 != arg2 || this.anInt2999 != arg3) {
			this.anInt3001 = arg2;
			this.anInt2999 = arg3;
			for (@Pc(31) Class3 local31 = this.aClass553_42.method32768(); local31 != this.aClass553_42.aClass3_238; local31 = local31.aClass3_246) {
				((Class3_Sub9) local31).method18613(this.anInt3001, this.anInt2999);
			}
			this.aBoolean543 = true;
			this.aBoolean545 = true;
			this.aBoolean546 = true;
		}
		if (!this.method22040()) {
			return false;
		}
		this.anInt3000 = arg0;
		this.anInt2998 = arg1;
		this.aBoolean544 = true;
		this.aClass21_Sub2_45.method4034(-this.anInt3000, this.anInt2999 + this.anInt2998 - this.aClass21_Sub2_45.method17037().method21391());
		this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
		this.aClass21_Sub2_45.method17061(3, 0);
		this.aClass19_Sub1_Sub3_5.method17949(0);
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "(IIII)Z", line = 153)
	boolean method22053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_Sub1_Sub3_5 == null || this.aClass553_42.method32712() || this.method22035()) {
			return false;
		}
		if (this.anInt3001 != arg2 || this.anInt2999 != arg3) {
			this.anInt3001 = arg2;
			this.anInt2999 = arg3;
			for (@Pc(31) Class3 local31 = this.aClass553_42.method32768(); local31 != this.aClass553_42.aClass3_238; local31 = local31.aClass3_246) {
				((Class3_Sub9) local31).method18613(this.anInt3001, this.anInt2999);
			}
			this.aBoolean543 = true;
			this.aBoolean545 = true;
			this.aBoolean546 = true;
		}
		if (!this.method22040()) {
			return false;
		}
		this.anInt3000 = arg0;
		this.anInt2998 = arg1;
		this.aBoolean544 = true;
		this.aClass21_Sub2_45.method4034(-this.anInt3000, this.anInt2999 + this.anInt2998 - this.aClass21_Sub2_45.method17037().method21391());
		this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
		this.aClass21_Sub2_45.method17061(3, 0);
		this.aClass19_Sub1_Sub3_5.method17949(0);
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(IIII)Z", line = 153)
	boolean method22054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_Sub1_Sub3_5 == null || this.aClass553_42.method32712() || this.method22035()) {
			return false;
		}
		if (this.anInt3001 != arg2 || this.anInt2999 != arg3) {
			this.anInt3001 = arg2;
			this.anInt2999 = arg3;
			for (@Pc(31) Class3 local31 = this.aClass553_42.method32768(); local31 != this.aClass553_42.aClass3_238; local31 = local31.aClass3_246) {
				((Class3_Sub9) local31).method18613(this.anInt3001, this.anInt2999);
			}
			this.aBoolean543 = true;
			this.aBoolean545 = true;
			this.aBoolean546 = true;
		}
		if (!this.method22040()) {
			return false;
		}
		this.anInt3000 = arg0;
		this.anInt2998 = arg1;
		this.aBoolean544 = true;
		this.aClass21_Sub2_45.method4034(-this.anInt3000, this.anInt2999 + this.anInt2998 - this.aClass21_Sub2_45.method17037().method21391());
		this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_5);
		this.aClass21_Sub2_45.method17061(3, 0);
		this.aClass19_Sub1_Sub3_5.method17949(0);
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "()V", line = 178)
	void method22038() {
		if (!this.aBoolean544) {
			return;
		}
		if (this.aClass19_Sub1_Sub3_4 != null) {
			this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_4);
			this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
			this.aClass19_Sub1_Sub3_6.method17949(0);
			this.aClass19_Sub1_Sub3_4.method20884(0, 0, this.anInt3001, this.anInt2999, 0, 0, true, this.aBoolean548);
		}
		this.aClass21_Sub2_45.method4068();
		this.aClass21_Sub2_45.method4089(0);
		this.aClass21_Sub2_45.method4115(1);
		this.aClass21_Sub2_45.method17056();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(68) Class3_Sub9 local68;
		for (local68 = (Class3_Sub9) this.aClass553_42.method32768(); local68 != null; local68 = (Class3_Sub9) this.aClass553_42.method32709()) {
			if (!local68.method18597()) {
				local58++;
			}
		}
		@Pc(84) Class3_Sub9[] local84 = new Class3_Sub9[local58];
		local58 = 0;
		for (local68 = (Class3_Sub9) this.aClass553_42.method32768(); local68 != null; local68 = (Class3_Sub9) this.aClass553_42.method32709()) {
			if (!local68.method18597()) {
				local84[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class3_Sub9 local121 = local84[local114];
				if (local121.method18593() == local60) {
					@Pc(128) int local128 = local121.method18618();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						local121.method18590(local130, this.aClass4_Sub1Array4[local52], this.aClass4_Sub1_6);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
							this.aClass21_Sub2_45.method4034(0, 0);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3000, this.anInt2998);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3000, this.anInt2998 + this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3000 + this.anInt3001, this.anInt2998 + this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3000 + this.anInt3001, this.anInt2998);
							OpenGL.glEnd();
						} else {
							this.aClass19_Sub1_Sub3_6.method17949(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3001, this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3001, 0);
							OpenGL.glEnd();
						}
						local121.method18591(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean544 = false;
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "()V", line = 178)
	void method22055() {
		if (!this.aBoolean544) {
			return;
		}
		if (this.aClass19_Sub1_Sub3_4 != null) {
			this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_4);
			this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
			this.aClass19_Sub1_Sub3_6.method17949(0);
			this.aClass19_Sub1_Sub3_4.method20884(0, 0, this.anInt3001, this.anInt2999, 0, 0, true, this.aBoolean548);
		}
		this.aClass21_Sub2_45.method4068();
		this.aClass21_Sub2_45.method4089(0);
		this.aClass21_Sub2_45.method4115(1);
		this.aClass21_Sub2_45.method17056();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(68) Class3_Sub9 local68;
		for (local68 = (Class3_Sub9) this.aClass553_42.method32768(); local68 != null; local68 = (Class3_Sub9) this.aClass553_42.method32709()) {
			if (!local68.method18597()) {
				local58++;
			}
		}
		@Pc(84) Class3_Sub9[] local84 = new Class3_Sub9[local58];
		local58 = 0;
		for (local68 = (Class3_Sub9) this.aClass553_42.method32768(); local68 != null; local68 = (Class3_Sub9) this.aClass553_42.method32709()) {
			if (!local68.method18597()) {
				local84[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class3_Sub9 local121 = local84[local114];
				if (local121.method18593() == local60) {
					@Pc(128) int local128 = local121.method18618();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						local121.method18590(local130, this.aClass4_Sub1Array4[local52], this.aClass4_Sub1_6);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
							this.aClass21_Sub2_45.method4034(0, 0);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3000, this.anInt2998);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3000, this.anInt2998 + this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3000 + this.anInt3001, this.anInt2998 + this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3000 + this.anInt3001, this.anInt2998);
							OpenGL.glEnd();
						} else {
							this.aClass19_Sub1_Sub3_6.method17949(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3001, this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3001, 0);
							OpenGL.glEnd();
						}
						local121.method18591(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean544 = false;
	}

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "()V", line = 178)
	void method22056() {
		if (!this.aBoolean544) {
			return;
		}
		if (this.aClass19_Sub1_Sub3_4 != null) {
			this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_4);
			this.aClass21_Sub2_45.method17044(this.aClass19_Sub1_Sub3_6);
			this.aClass19_Sub1_Sub3_6.method17949(0);
			this.aClass19_Sub1_Sub3_4.method20884(0, 0, this.anInt3001, this.anInt2999, 0, 0, true, this.aBoolean548);
		}
		this.aClass21_Sub2_45.method4068();
		this.aClass21_Sub2_45.method4089(0);
		this.aClass21_Sub2_45.method4115(1);
		this.aClass21_Sub2_45.method17056();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(68) Class3_Sub9 local68;
		for (local68 = (Class3_Sub9) this.aClass553_42.method32768(); local68 != null; local68 = (Class3_Sub9) this.aClass553_42.method32709()) {
			if (!local68.method18597()) {
				local58++;
			}
		}
		@Pc(84) Class3_Sub9[] local84 = new Class3_Sub9[local58];
		local58 = 0;
		for (local68 = (Class3_Sub9) this.aClass553_42.method32768(); local68 != null; local68 = (Class3_Sub9) this.aClass553_42.method32709()) {
			if (!local68.method18597()) {
				local84[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class3_Sub9 local121 = local84[local114];
				if (local121.method18593() == local60) {
					@Pc(128) int local128 = local121.method18618();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						local121.method18590(local130, this.aClass4_Sub1Array4[local52], this.aClass4_Sub1_6);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass21_Sub2_45.method17263(this.aClass19_Sub1_Sub3_6);
							this.aClass21_Sub2_45.method4034(0, 0);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3000, this.anInt2998);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3000, this.anInt2998 + this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3000 + this.anInt3001, this.anInt2998 + this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3000 + this.anInt3001, this.anInt2998);
							OpenGL.glEnd();
						} else {
							this.aClass19_Sub1_Sub3_6.method17949(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3001, this.anInt2999);
							OpenGL.glTexCoord2f((float) this.anInt3001, (float) this.anInt2999);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3001, 0);
							OpenGL.glEnd();
						}
						local121.method18591(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean544 = false;
	}

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "(Lclient!afq;)Z", line = 261)
	boolean method22031(@OriginalArg(0) Class3_Sub9 arg0) {
		if (this.aClass19_Sub1_Sub3_5 != null) {
			if (arg0.method18586() || arg0.method18605()) {
				this.aClass553_42.method32702(arg0);
				this.method22041();
				if (arg0.method18593() >= 0 && this.method22040()) {
					if (this.anInt3001 != -1 && this.anInt2999 != -1) {
						arg0.method18613(this.anInt3001, this.anInt2999);
					}
					arg0.aBoolean466 = true;
					return true;
				}
			}
			this.method22036(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "at", descriptor = "(Lclient!afq;)Z", line = 261)
	boolean method22058(@OriginalArg(0) Class3_Sub9 arg0) {
		if (this.aClass19_Sub1_Sub3_5 != null) {
			if (arg0.method18586() || arg0.method18605()) {
				this.aClass553_42.method32702(arg0);
				this.method22041();
				if (arg0.method18593() >= 0 && this.method22040()) {
					if (this.anInt3001 != -1 && this.anInt2999 != -1) {
						arg0.method18613(this.anInt3001, this.anInt2999);
					}
					arg0.aBoolean466 = true;
					return true;
				}
			}
			this.method22036(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "(Lclient!afq;)V", line = 279)
	void method22036(@OriginalArg(0) Class3_Sub9 arg0) {
		arg0.aBoolean466 = false;
		arg0.method18588();
		arg0.method33656();
		this.method22041();
	}

	@OriginalMember(owner = "client!ck", name = "af", descriptor = "(Lclient!afq;)V", line = 279)
	void method22060(@OriginalArg(0) Class3_Sub9 arg0) {
		arg0.aBoolean466 = false;
		arg0.method18588();
		arg0.method33656();
		this.method22041();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()V", line = 286)
	void method22041() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class127 local5 = Class127.aClass127_23;
		for (@Pc(11) Class3_Sub9 local11 = (Class3_Sub9) this.aClass553_42.method32768(); local11 != null; local11 = (Class3_Sub9) this.aClass553_42.method32709()) {
			@Pc(16) Class127 local16 = local11.method18625();
			if (local16.anInt3315 * -1246993659 > local5.anInt3315 * -1246993659) {
				local5 = local16;
			}
			local3 |= local11.method18594();
			local1 += local11.method18618();
		}
		if (local5 != this.aClass127_17) {
			this.aClass127_17 = local5;
			this.aBoolean543 = true;
		}
		@Pc(63) int local63 = this.anInt3002 > 2 ? 2 : this.anInt3002;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean543 = true;
			this.aBoolean546 = true;
		}
		if (local3 != this.aBoolean548) {
			this.aBoolean548 = local3;
			this.aBoolean545 = true;
		}
		this.anInt3002 = local1;
	}

	@OriginalMember(owner = "client!ck", name = "aa", descriptor = "()V", line = 286)
	void method22043() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class127 local5 = Class127.aClass127_23;
		for (@Pc(11) Class3_Sub9 local11 = (Class3_Sub9) this.aClass553_42.method32768(); local11 != null; local11 = (Class3_Sub9) this.aClass553_42.method32709()) {
			@Pc(16) Class127 local16 = local11.method18625();
			if (local16.anInt3315 * -1246993659 > local5.anInt3315 * -1246993659) {
				local5 = local16;
			}
			local3 |= local11.method18594();
			local1 += local11.method18618();
		}
		if (local5 != this.aClass127_17) {
			this.aClass127_17 = local5;
			this.aBoolean543 = true;
		}
		@Pc(63) int local63 = this.anInt3002 > 2 ? 2 : this.anInt3002;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean543 = true;
			this.aBoolean546 = true;
		}
		if (local3 != this.aBoolean548) {
			this.aBoolean548 = local3;
			this.aBoolean545 = true;
		}
		this.anInt3002 = local1;
	}

	@OriginalMember(owner = "client!ck", name = "ak", descriptor = "()V", line = 286)
	void method22059() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class127 local5 = Class127.aClass127_23;
		for (@Pc(11) Class3_Sub9 local11 = (Class3_Sub9) this.aClass553_42.method32768(); local11 != null; local11 = (Class3_Sub9) this.aClass553_42.method32709()) {
			@Pc(16) Class127 local16 = local11.method18625();
			if (local16.anInt3315 * -1246993659 > local5.anInt3315 * -1246993659) {
				local5 = local16;
			}
			local3 |= local11.method18594();
			local1 += local11.method18618();
		}
		if (local5 != this.aClass127_17) {
			this.aClass127_17 = local5;
			this.aBoolean543 = true;
		}
		@Pc(63) int local63 = this.anInt3002 > 2 ? 2 : this.anInt3002;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean543 = true;
			this.aBoolean546 = true;
		}
		if (local3 != this.aBoolean548) {
			this.aBoolean548 = local3;
			this.aBoolean545 = true;
		}
		this.anInt3002 = local1;
	}
}
