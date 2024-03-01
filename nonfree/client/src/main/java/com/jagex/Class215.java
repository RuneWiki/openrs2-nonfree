package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public class Class215 {

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "Lclient!adt;")
	Class88_Sub2 aClass88_Sub2_7;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "Lclient!aeg;")
	Class93_Sub1_Sub3 aClass93_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "Lclient!aeg;")
	Class93_Sub1_Sub3 aClass93_Sub1_Sub3_2;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "Z")
	boolean aBoolean644;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	int anInt3608 = 0;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
	int anInt3609 = 0;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
	int anInt3612 = 1;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
	int anInt3610 = 1;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Lclient!aat;")
	Class22 aClass22_50 = new Class22();

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Z")
	boolean aBoolean639 = true;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Z")
	boolean aBoolean640 = true;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "Z")
	boolean aBoolean641 = true;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Z")
	boolean aBoolean642 = true;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "[Lclient!adt;")
	Class88_Sub2[] aClass88_Sub2Array4 = new Class88_Sub2[2];

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "Z")
	boolean aBoolean643 = false;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
	int anInt3611 = 0;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "Lclient!dg;")
	Class226 aClass226_18 = Class226.aClass226_22;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_47;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_4;

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_6;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_5;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!afa;)V", line = 32)
	Class215(@OriginalArg(0) Class104_Sub1 arg0) {
		this.aClass104_Sub1_47 = arg0;
		if (this.aClass104_Sub1_47.aBoolean90 && this.aClass104_Sub1_47.aBoolean87) {
			this.aClass112_Sub1_Sub2_6 = this.aClass112_Sub1_Sub2_4 = new Class112_Sub1_Sub2(this.aClass104_Sub1_47);
			if (this.aClass104_Sub1_47.anInt566 > 1 && this.aClass104_Sub1_47.aBoolean77 && this.aClass104_Sub1_47.aBoolean91) {
				this.aClass112_Sub1_Sub2_6 = this.aClass112_Sub1_Sub2_5 = new Class112_Sub1_Sub2(this.aClass104_Sub1_47);
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "()V", line = 41)
	void method25487() {
		this.aClass112_Sub1_Sub2_4 = null;
		this.aClass112_Sub1_Sub2_5 = null;
		this.aClass112_Sub1_Sub2_6 = null;
		this.aClass93_Sub1_Sub3_2 = null;
		this.aClass88_Sub2_7 = null;
		this.aClass88_Sub2Array4 = null;
		this.aClass93_Sub1_Sub3_1 = null;
		if (!this.aClass22_50.method418()) {
			for (@Pc(30) Class93 local30 = this.aClass22_50.method445(); local30 != this.aClass22_50.aClass93_8; local30 = local30.aClass93_227) {
				((Class93_Sub4) local30).method20199();
			}
		}
		this.anInt3610 = 1;
		this.anInt3612 = 1;
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "()V", line = 41)
	void method25495() {
		this.aClass112_Sub1_Sub2_4 = null;
		this.aClass112_Sub1_Sub2_5 = null;
		this.aClass112_Sub1_Sub2_6 = null;
		this.aClass93_Sub1_Sub3_2 = null;
		this.aClass88_Sub2_7 = null;
		this.aClass88_Sub2Array4 = null;
		this.aClass93_Sub1_Sub3_1 = null;
		if (!this.aClass22_50.method418()) {
			for (@Pc(30) Class93 local30 = this.aClass22_50.method445(); local30 != this.aClass22_50.aClass93_8; local30 = local30.aClass93_227) {
				((Class93_Sub4) local30).method20199();
			}
		}
		this.anInt3610 = 1;
		this.anInt3612 = 1;
	}

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "()Z", line = 58)
	boolean method25475() {
		return this.aClass112_Sub1_Sub2_6 != null;
	}

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "()Z", line = 62)
	boolean method25484() {
		return this.aBoolean644;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "()Z", line = 62)
	boolean method25485() {
		return this.aBoolean644;
	}

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "()Z", line = 62)
	boolean method25486() {
		return this.aBoolean644;
	}

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "()Z", line = 62)
	boolean method25490() {
		return this.aBoolean644;
	}

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "()Z", line = 66)
	boolean method25476() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445(); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local5.method20180()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "()Z", line = 66)
	boolean method25478() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445(); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local5.method20180()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "()Z", line = 66)
	boolean method25488() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445(); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local5.method20180()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "()Z", line = 66)
	boolean method25489() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445(); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local5.method20180()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "()Z", line = 66)
	boolean method25491() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445(); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local5.method20180()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "()Z", line = 73)
	boolean method25474() {
		if (this.aBoolean640) {
			if (this.aClass93_Sub1_Sub3_2 != null) {
				this.aClass93_Sub1_Sub3_2.method30884();
				this.aClass93_Sub1_Sub3_2 = null;
			}
			if (this.aClass88_Sub2_7 != null) {
				this.aClass88_Sub2_7.method18048();
				this.aClass88_Sub2_7 = null;
			}
		}
		if (this.aBoolean639) {
			if (this.aClass93_Sub1_Sub3_1 != null) {
				this.aClass93_Sub1_Sub3_1.method30884();
				this.aClass93_Sub1_Sub3_1 = null;
			}
			if (this.aClass88_Sub2Array4[0] != null) {
				this.aClass88_Sub2Array4[0].method18048();
				this.aClass88_Sub2Array4[0] = null;
			}
			if (this.aClass88_Sub2Array4[1] != null) {
				this.aClass88_Sub2Array4[1].method18048();
				this.aClass88_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean640) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3612, this.anInt3610, this.aClass104_Sub1_47.anInt566);
			}
			if (this.aBoolean643) {
				this.aClass88_Sub2_7 = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_17, Class226.aClass226_26, this.anInt3612, this.anInt3610);
			} else if (this.aClass93_Sub1_Sub3_2 == null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3612, this.anInt3610);
			}
			this.aBoolean640 = false;
			this.aBoolean641 = true;
			this.aBoolean642 = true;
		}
		if (this.aBoolean639) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_1 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_22, this.aClass226_18, this.anInt3612, this.anInt3610, this.aClass104_Sub1_47.anInt566);
			}
			this.aClass88_Sub2Array4[0] = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3612, this.anInt3610);
			this.aClass88_Sub2Array4[1] = this.anInt3611 > 1 ? new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3612, this.anInt3610) : null;
			this.aBoolean639 = false;
			this.aBoolean641 = true;
			this.aBoolean642 = true;
		}
		if (this.aBoolean641) {
			if (this.aClass112_Sub1_Sub2_5 == null) {
				this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_4);
				this.aClass112_Sub1_Sub2_4.method23436(null);
				this.aClass112_Sub1_Sub2_4.method23434(0, null);
				this.aClass112_Sub1_Sub2_4.method23434(1, null);
				this.aClass112_Sub1_Sub2_4.method23434(0, this.aClass88_Sub2Array4[0].method18085(0));
				this.aClass112_Sub1_Sub2_4.method23434(1, this.anInt3611 > 1 ? this.aClass88_Sub2Array4[1].method18085(0) : null);
				if (this.aBoolean643) {
					this.aClass112_Sub1_Sub2_4.method23436(this.aClass88_Sub2_7.method18088(0));
				} else {
					this.aClass112_Sub1_Sub2_4.method23436(this.aClass93_Sub1_Sub3_2);
				}
				this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_4);
			} else {
				this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_4);
				this.aClass112_Sub1_Sub2_4.method23436(null);
				this.aClass112_Sub1_Sub2_4.method23434(0, null);
				this.aClass112_Sub1_Sub2_4.method23434(1, null);
				this.aClass112_Sub1_Sub2_4.method23434(0, this.aClass88_Sub2Array4[0].method18085(0));
				this.aClass112_Sub1_Sub2_4.method23434(1, this.anInt3611 > 1 ? this.aClass88_Sub2Array4[1].method18085(0) : null);
				if (this.aBoolean643) {
					this.aClass112_Sub1_Sub2_4.method23436(this.aClass88_Sub2_7.method18088(0));
				}
				this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_4);
				this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_5);
				this.aClass112_Sub1_Sub2_5.method23436(null);
				this.aClass112_Sub1_Sub2_5.method23434(0, null);
				this.aClass112_Sub1_Sub2_5.method23434(0, this.aClass93_Sub1_Sub3_1);
				this.aClass112_Sub1_Sub2_5.method23436(this.aClass93_Sub1_Sub3_2);
				this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_5);
			}
			this.aBoolean641 = false;
			this.aBoolean642 = true;
		}
		if (this.aBoolean642) {
			this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_6);
			this.aBoolean642 = !this.aClass112_Sub1_Sub2_6.method23441();
			this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_6);
		}
		return !this.aBoolean642;
	}

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "()Z", line = 73)
	boolean method25492() {
		if (this.aBoolean640) {
			if (this.aClass93_Sub1_Sub3_2 != null) {
				this.aClass93_Sub1_Sub3_2.method30884();
				this.aClass93_Sub1_Sub3_2 = null;
			}
			if (this.aClass88_Sub2_7 != null) {
				this.aClass88_Sub2_7.method18048();
				this.aClass88_Sub2_7 = null;
			}
		}
		if (this.aBoolean639) {
			if (this.aClass93_Sub1_Sub3_1 != null) {
				this.aClass93_Sub1_Sub3_1.method30884();
				this.aClass93_Sub1_Sub3_1 = null;
			}
			if (this.aClass88_Sub2Array4[0] != null) {
				this.aClass88_Sub2Array4[0].method18048();
				this.aClass88_Sub2Array4[0] = null;
			}
			if (this.aClass88_Sub2Array4[1] != null) {
				this.aClass88_Sub2Array4[1].method18048();
				this.aClass88_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean640) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3612, this.anInt3610, this.aClass104_Sub1_47.anInt566);
			}
			if (this.aBoolean643) {
				this.aClass88_Sub2_7 = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_17, Class226.aClass226_26, this.anInt3612, this.anInt3610);
			} else if (this.aClass93_Sub1_Sub3_2 == null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3612, this.anInt3610);
			}
			this.aBoolean640 = false;
			this.aBoolean641 = true;
			this.aBoolean642 = true;
		}
		if (this.aBoolean639) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_1 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_22, this.aClass226_18, this.anInt3612, this.anInt3610, this.aClass104_Sub1_47.anInt566);
			}
			this.aClass88_Sub2Array4[0] = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3612, this.anInt3610);
			this.aClass88_Sub2Array4[1] = this.anInt3611 > 1 ? new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3612, this.anInt3610) : null;
			this.aBoolean639 = false;
			this.aBoolean641 = true;
			this.aBoolean642 = true;
		}
		if (this.aBoolean641) {
			if (this.aClass112_Sub1_Sub2_5 == null) {
				this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_4);
				this.aClass112_Sub1_Sub2_4.method23436(null);
				this.aClass112_Sub1_Sub2_4.method23434(0, null);
				this.aClass112_Sub1_Sub2_4.method23434(1, null);
				this.aClass112_Sub1_Sub2_4.method23434(0, this.aClass88_Sub2Array4[0].method18085(0));
				this.aClass112_Sub1_Sub2_4.method23434(1, this.anInt3611 > 1 ? this.aClass88_Sub2Array4[1].method18085(0) : null);
				if (this.aBoolean643) {
					this.aClass112_Sub1_Sub2_4.method23436(this.aClass88_Sub2_7.method18088(0));
				} else {
					this.aClass112_Sub1_Sub2_4.method23436(this.aClass93_Sub1_Sub3_2);
				}
				this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_4);
			} else {
				this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_4);
				this.aClass112_Sub1_Sub2_4.method23436(null);
				this.aClass112_Sub1_Sub2_4.method23434(0, null);
				this.aClass112_Sub1_Sub2_4.method23434(1, null);
				this.aClass112_Sub1_Sub2_4.method23434(0, this.aClass88_Sub2Array4[0].method18085(0));
				this.aClass112_Sub1_Sub2_4.method23434(1, this.anInt3611 > 1 ? this.aClass88_Sub2Array4[1].method18085(0) : null);
				if (this.aBoolean643) {
					this.aClass112_Sub1_Sub2_4.method23436(this.aClass88_Sub2_7.method18088(0));
				}
				this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_4);
				this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_5);
				this.aClass112_Sub1_Sub2_5.method23436(null);
				this.aClass112_Sub1_Sub2_5.method23434(0, null);
				this.aClass112_Sub1_Sub2_5.method23434(0, this.aClass93_Sub1_Sub3_1);
				this.aClass112_Sub1_Sub2_5.method23436(this.aClass93_Sub1_Sub3_2);
				this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_5);
			}
			this.aBoolean641 = false;
			this.aBoolean642 = true;
		}
		if (this.aBoolean642) {
			this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_6);
			this.aBoolean642 = !this.aClass112_Sub1_Sub2_6.method23441();
			this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_6);
		}
		return !this.aBoolean642;
	}

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "(IIII)Z", line = 153)
	boolean method25479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_Sub1_Sub2_6 == null || this.aClass22_50.method418() || this.method25476()) {
			return false;
		}
		if (this.anInt3612 != arg2 || this.anInt3610 != arg3) {
			this.anInt3612 = arg2;
			this.anInt3610 = arg3;
			for (@Pc(31) Class93 local31 = this.aClass22_50.method445(); local31 != this.aClass22_50.aClass93_8; local31 = local31.aClass93_227) {
				((Class93_Sub4) local31).method20169(this.anInt3612, this.anInt3610);
			}
			this.aBoolean639 = true;
			this.aBoolean640 = true;
			this.aBoolean641 = true;
		}
		if (!this.method25474()) {
			return false;
		}
		this.anInt3608 = arg0;
		this.anInt3609 = arg1;
		this.aBoolean644 = true;
		this.aClass104_Sub1_47.method3952(-this.anInt3608, this.anInt3610 + this.anInt3609 - this.aClass104_Sub1_47.method20434().method23737());
		this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_6);
		this.aClass112_Sub1_Sub2_6.method18014(0);
		this.aClass104_Sub1_47.method20774(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIII)Z", line = 153)
	boolean method25493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_Sub1_Sub2_6 == null || this.aClass22_50.method418() || this.method25476()) {
			return false;
		}
		if (this.anInt3612 != arg2 || this.anInt3610 != arg3) {
			this.anInt3612 = arg2;
			this.anInt3610 = arg3;
			for (@Pc(31) Class93 local31 = this.aClass22_50.method445(); local31 != this.aClass22_50.aClass93_8; local31 = local31.aClass93_227) {
				((Class93_Sub4) local31).method20169(this.anInt3612, this.anInt3610);
			}
			this.aBoolean639 = true;
			this.aBoolean640 = true;
			this.aBoolean641 = true;
		}
		if (!this.method25474()) {
			return false;
		}
		this.anInt3608 = arg0;
		this.anInt3609 = arg1;
		this.aBoolean644 = true;
		this.aClass104_Sub1_47.method3952(-this.anInt3608, this.anInt3610 + this.anInt3609 - this.aClass104_Sub1_47.method20434().method23737());
		this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_6);
		this.aClass112_Sub1_Sub2_6.method18014(0);
		this.aClass104_Sub1_47.method20774(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "(IIII)Z", line = 153)
	boolean method25494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_Sub1_Sub2_6 == null || this.aClass22_50.method418() || this.method25476()) {
			return false;
		}
		if (this.anInt3612 != arg2 || this.anInt3610 != arg3) {
			this.anInt3612 = arg2;
			this.anInt3610 = arg3;
			for (@Pc(31) Class93 local31 = this.aClass22_50.method445(); local31 != this.aClass22_50.aClass93_8; local31 = local31.aClass93_227) {
				((Class93_Sub4) local31).method20169(this.anInt3612, this.anInt3610);
			}
			this.aBoolean639 = true;
			this.aBoolean640 = true;
			this.aBoolean641 = true;
		}
		if (!this.method25474()) {
			return false;
		}
		this.anInt3608 = arg0;
		this.anInt3609 = arg1;
		this.aBoolean644 = true;
		this.aClass104_Sub1_47.method3952(-this.anInt3608, this.anInt3610 + this.anInt3609 - this.aClass104_Sub1_47.method20434().method23737());
		this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_6);
		this.aClass112_Sub1_Sub2_6.method18014(0);
		this.aClass104_Sub1_47.method20774(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "(II)V", line = 178)
	void method25480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean644) {
			return;
		}
		if (this.aClass112_Sub1_Sub2_5 != null) {
			this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_5);
			this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_4);
			this.aClass112_Sub1_Sub2_4.method18014(0);
			this.aClass112_Sub1_Sub2_5.method23435(0, 0, this.anInt3612, this.anInt3610, 0, 0, true, this.aBoolean643);
		}
		this.aClass104_Sub1_47.method3799();
		this.aClass104_Sub1_47.method3818(0);
		this.aClass104_Sub1_47.method3805(1);
		this.aClass104_Sub1_47.method20466();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(68) Class93_Sub4 local68;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445(); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local68.method20180()) {
				local58++;
			}
		}
		@Pc(84) Class93_Sub4[] local84 = new Class93_Sub4[local58];
		local58 = 0;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445(); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local68.method20180()) {
				local84[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class93_Sub4 local121 = local84[local114];
				if (local121.method20175() == local60) {
					@Pc(128) int local128 = local121.method20198();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass104_Sub1_47.method3952(0, 0);
						local121.method20166(local130, this.aClass88_Sub2Array4[local52], this.aClass88_Sub2_7, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_4);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3608, this.anInt3609);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3608, this.anInt3609 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3608 + arg0, this.anInt3609 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3608 + arg0, this.anInt3609);
							OpenGL.glEnd();
						} else {
							this.aClass112_Sub1_Sub2_4.method18014(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method20167(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean644 = false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V", line = 178)
	void method25483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean644) {
			return;
		}
		if (this.aClass112_Sub1_Sub2_5 != null) {
			this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_5);
			this.aClass104_Sub1_47.method20441(this.aClass112_Sub1_Sub2_4);
			this.aClass112_Sub1_Sub2_4.method18014(0);
			this.aClass112_Sub1_Sub2_5.method23435(0, 0, this.anInt3612, this.anInt3610, 0, 0, true, this.aBoolean643);
		}
		this.aClass104_Sub1_47.method3799();
		this.aClass104_Sub1_47.method3818(0);
		this.aClass104_Sub1_47.method3805(1);
		this.aClass104_Sub1_47.method20466();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(68) Class93_Sub4 local68;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445(); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local68.method20180()) {
				local58++;
			}
		}
		@Pc(84) Class93_Sub4[] local84 = new Class93_Sub4[local58];
		local58 = 0;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445(); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415()) {
			if (!local68.method20180()) {
				local84[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class93_Sub4 local121 = local84[local114];
				if (local121.method20175() == local60) {
					@Pc(128) int local128 = local121.method20198();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass104_Sub1_47.method3952(0, 0);
						local121.method20166(local130, this.aClass88_Sub2Array4[local52], this.aClass88_Sub2_7, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass104_Sub1_47.method20442(this.aClass112_Sub1_Sub2_4);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3608, this.anInt3609);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3608, this.anInt3609 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3608 + arg0, this.anInt3609 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3608 + arg0, this.anInt3609);
							OpenGL.glEnd();
						} else {
							this.aClass112_Sub1_Sub2_4.method18014(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3610 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3610);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method20167(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean644 = false;
	}

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "(Lclient!ajl;)Z", line = 261)
	boolean method25481(@OriginalArg(0) Class93_Sub4 arg0) {
		if (this.aClass112_Sub1_Sub2_6 != null) {
			if (arg0.method20168() || arg0.method20163()) {
				this.aClass22_50.method407(arg0);
				this.method25477();
				if (arg0.method20175() >= 0 && this.method25474()) {
					if (this.anInt3612 != -1 && this.anInt3610 != -1) {
						arg0.method20169(this.anInt3612, this.anInt3610);
					}
					arg0.aBoolean457 = true;
					return true;
				}
			}
			this.method25482(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "(Lclient!ajl;)Z", line = 261)
	boolean method25496(@OriginalArg(0) Class93_Sub4 arg0) {
		if (this.aClass112_Sub1_Sub2_6 != null) {
			if (arg0.method20168() || arg0.method20163()) {
				this.aClass22_50.method407(arg0);
				this.method25477();
				if (arg0.method20175() >= 0 && this.method25474()) {
					if (this.anInt3612 != -1 && this.anInt3610 != -1) {
						arg0.method20169(this.anInt3612, this.anInt3610);
					}
					arg0.aBoolean457 = true;
					return true;
				}
			}
			this.method25482(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "(Lclient!ajl;)Z", line = 261)
	boolean method25497(@OriginalArg(0) Class93_Sub4 arg0) {
		if (this.aClass112_Sub1_Sub2_6 != null) {
			if (arg0.method20168() || arg0.method20163()) {
				this.aClass22_50.method407(arg0);
				this.method25477();
				if (arg0.method20175() >= 0 && this.method25474()) {
					if (this.anInt3612 != -1 && this.anInt3610 != -1) {
						arg0.method20169(this.anInt3612, this.anInt3610);
					}
					arg0.aBoolean457 = true;
					return true;
				}
			}
			this.method25482(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "(Lclient!ajl;)V", line = 279)
	void method25482(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean457 = false;
		arg0.method20199();
		arg0.method23969();
		this.method25477();
	}

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "(Lclient!ajl;)V", line = 279)
	void method25498(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean457 = false;
		arg0.method20199();
		arg0.method23969();
		this.method25477();
	}

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "(Lclient!ajl;)V", line = 279)
	void method25499(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean457 = false;
		arg0.method20199();
		arg0.method23969();
		this.method25477();
	}

	@OriginalMember(owner = "client!cv", name = "ae", descriptor = "(Lclient!ajl;)V", line = 279)
	void method25500(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean457 = false;
		arg0.method20199();
		arg0.method23969();
		this.method25477();
	}

	@OriginalMember(owner = "client!cv", name = "ag", descriptor = "(Lclient!ajl;)V", line = 279)
	void method25501(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean457 = false;
		arg0.method20199();
		arg0.method23969();
		this.method25477();
	}

	@OriginalMember(owner = "client!cv", name = "ah", descriptor = "()V", line = 286)
	void method25473() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class226 local5 = Class226.aClass226_22;
		for (@Pc(11) Class93_Sub4 local11 = (Class93_Sub4) this.aClass22_50.method445(); local11 != null; local11 = (Class93_Sub4) this.aClass22_50.method415()) {
			@Pc(16) Class226 local16 = local11.method20171();
			if (local16.anInt3646 * -1066472467 > local5.anInt3646 * -1066472467) {
				local5 = local16;
			}
			local3 |= local11.method20170();
			local1 += local11.method20198();
		}
		if (local5 != this.aClass226_18) {
			this.aClass226_18 = local5;
			this.aBoolean639 = true;
		}
		@Pc(63) int local63 = this.anInt3611 > 2 ? 2 : this.anInt3611;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean639 = true;
			this.aBoolean641 = true;
		}
		if (local3 != this.aBoolean643) {
			this.aBoolean643 = local3;
			this.aBoolean640 = true;
		}
		this.anInt3611 = local1;
	}

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "()V", line = 286)
	void method25477() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class226 local5 = Class226.aClass226_22;
		for (@Pc(11) Class93_Sub4 local11 = (Class93_Sub4) this.aClass22_50.method445(); local11 != null; local11 = (Class93_Sub4) this.aClass22_50.method415()) {
			@Pc(16) Class226 local16 = local11.method20171();
			if (local16.anInt3646 * -1066472467 > local5.anInt3646 * -1066472467) {
				local5 = local16;
			}
			local3 |= local11.method20170();
			local1 += local11.method20198();
		}
		if (local5 != this.aClass226_18) {
			this.aClass226_18 = local5;
			this.aBoolean639 = true;
		}
		@Pc(63) int local63 = this.anInt3611 > 2 ? 2 : this.anInt3611;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean639 = true;
			this.aBoolean641 = true;
		}
		if (local3 != this.aBoolean643) {
			this.aBoolean643 = local3;
			this.aBoolean640 = true;
		}
		this.anInt3611 = local1;
	}
}
