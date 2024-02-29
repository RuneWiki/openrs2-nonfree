package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arm")
public abstract class Class104_Sub1_Sub4 extends Class104_Sub1 {

	@OriginalMember(owner = "client!arm", name = "e", descriptor = "I")
	int anInt1434 = 0;

	@OriginalMember(owner = "client!arm", name = "f", descriptor = "[Lclient!ajv;")
	Class77_Sub22[] aClass77_Sub22Array15 = new Class77_Sub22[4];

	@OriginalMember(owner = "client!arm", name = "u", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!arm", name = "<init>", descriptor = "(Lclient!tk;IIIIII)V", line = 12)
	Class104_Sub1_Sub4(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.aShort99 = (short) arg6;
		this.method24102(new Class447((float) arg1, (float) arg2, (float) arg3));
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			this.aClass77_Sub22Array15[local34] = null;
		}
	}

	@OriginalMember(owner = "client!arm", name = "gc", descriptor = "([Lclient!ajv;I)I", line = 21)
	@Override
	int method24145(@OriginalArg(0) Class77_Sub22[] arg0) {
		if (this.aBoolean544) {
			@Pc(6) Class447 local6 = this.method24085().aClass447_61;
			this.anInt1434 = this.method24126((int) local6.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local6.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.aClass77_Sub22Array15) * -2139099123;
			this.aBoolean544 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1434 * 2141576901; local38++) {
			arg0[local38] = this.aClass77_Sub22Array15[local38];
		}
		return this.anInt1434 * 2141576901;
	}

	@OriginalMember(owner = "client!arm", name = "gx", descriptor = "([Lclient!ajv;)I", line = 21)
	@Override
	int method24169(@OriginalArg(0) Class77_Sub22[] arg0) {
		if (this.aBoolean544) {
			@Pc(6) Class447 local6 = this.method24085().aClass447_61;
			this.anInt1434 = this.method24126((int) local6.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local6.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.aClass77_Sub22Array15) * -2139099123;
			this.aBoolean544 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1434 * 2141576901; local38++) {
			arg0[local38] = this.aClass77_Sub22Array15[local38];
		}
		return this.anInt1434 * 2141576901;
	}

	@OriginalMember(owner = "client!arm", name = "gd", descriptor = "(Lclient!dx;)Z", line = 31)
	@Override
	boolean method24171(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arm", name = "gy", descriptor = "(Lclient!dx;I)Z", line = 31)
	@Override
	boolean method24146(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arm", name = "gv", descriptor = "(Lclient!dx;)Z", line = 31)
	@Override
	boolean method24170(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arm", name = "gn", descriptor = "(Lclient!dx;)Z", line = 31)
	@Override
	boolean method24172(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31050(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!arm", name = "gs", descriptor = "()Z", line = 36)
	@Override
	boolean method24173() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831)][((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547 + this.aClass556_23.anInt5259 * -1213435377];
	}

	@OriginalMember(owner = "client!arm", name = "gz", descriptor = "(B)Z", line = 36)
	@Override
	boolean method24147() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831)][((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547 + this.aClass556_23.anInt5259 * -1213435377];
	}

	@OriginalMember(owner = "client!arm", name = "gg", descriptor = "()Z", line = 36)
	@Override
	boolean method24168() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831)][((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547 + this.aClass556_23.anInt5259 * -1213435377];
	}
}
