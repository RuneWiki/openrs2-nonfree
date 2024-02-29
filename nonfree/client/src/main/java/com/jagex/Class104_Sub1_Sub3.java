package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aro")
public abstract class Class104_Sub1_Sub3 extends Class104_Sub1 {

	@OriginalMember(owner = "client!aro", name = "f", descriptor = "I")
	int anInt1322 = 0;

	@OriginalMember(owner = "client!aro", name = "o", descriptor = "[Lclient!ajv;")
	Class77_Sub22[] aClass77_Sub22Array11 = new Class77_Sub22[4];

	@OriginalMember(owner = "client!aro", name = "u", descriptor = "S")
	protected short aShort92;

	@OriginalMember(owner = "client!aro", name = "e", descriptor = "S")
	protected short aShort91;

	@OriginalMember(owner = "client!aro", name = "<init>", descriptor = "(Lclient!tk;IIIIIII)V", line = 13)
	Class104_Sub1_Sub3(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.aShort92 = (short) arg6;
		this.aShort91 = (short) arg7;
		this.method24102(new Class447((float) arg1, (float) arg2, (float) arg3));
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass77_Sub22Array11[local38] = null;
		}
	}

	@OriginalMember(owner = "client!aro", name = "gx", descriptor = "([Lclient!ajv;)I", line = 23)
	@Override
	int method24169(@OriginalArg(0) Class77_Sub22[] arg0) {
		if (this.aBoolean544) {
			@Pc(6) Class447 local6 = this.method24085().aClass447_61;
			this.anInt1322 = this.method24126((int) local6.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local6.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.aClass77_Sub22Array11) * -152576849;
			this.aBoolean544 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1322 * 1242626639; local38++) {
			arg0[local38] = this.aClass77_Sub22Array11[local38];
		}
		return this.anInt1322 * 1242626639;
	}

	@OriginalMember(owner = "client!aro", name = "gc", descriptor = "([Lclient!ajv;I)I", line = 23)
	@Override
	int method24145(@OriginalArg(0) Class77_Sub22[] arg0) {
		if (this.aBoolean544) {
			@Pc(6) Class447 local6 = this.method24085().aClass447_61;
			this.anInt1322 = this.method24126((int) local6.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local6.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.aClass77_Sub22Array11) * -152576849;
			this.aBoolean544 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1322 * 1242626639; local38++) {
			arg0[local38] = this.aClass77_Sub22Array11[local38];
		}
		return this.anInt1322 * 1242626639;
	}

	@OriginalMember(owner = "client!aro", name = "gy", descriptor = "(Lclient!dx;I)Z", line = 33)
	@Override
	boolean method24146(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.method24160());
	}

	@OriginalMember(owner = "client!aro", name = "gd", descriptor = "(Lclient!dx;)Z", line = 33)
	@Override
	boolean method24171(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.method24160());
	}

	@OriginalMember(owner = "client!aro", name = "gn", descriptor = "(Lclient!dx;)Z", line = 33)
	@Override
	boolean method24172(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.method24160());
	}

	@OriginalMember(owner = "client!aro", name = "gv", descriptor = "(Lclient!dx;)Z", line = 33)
	@Override
	boolean method24170(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31057(this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601, this.method24160());
	}

	@OriginalMember(owner = "client!aro", name = "gg", descriptor = "()Z", line = 38)
	@Override
	boolean method24168() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831)][((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547 + this.aClass556_23.anInt5259 * -1213435377];
	}

	@OriginalMember(owner = "client!aro", name = "gz", descriptor = "(B)Z", line = 38)
	@Override
	boolean method24147() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831)][((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547 + this.aClass556_23.anInt5259 * -1213435377];
	}

	@OriginalMember(owner = "client!aro", name = "gs", descriptor = "()Z", line = 38)
	@Override
	boolean method24173() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831)][((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547 + this.aClass556_23.anInt5259 * -1213435377];
	}

	@OriginalMember(owner = "client!aro", name = "fx", descriptor = "()Z", line = 43)
	@Override
	final boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!aro", name = "fu", descriptor = "(B)Z", line = 43)
	@Override
	final boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!aro", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 47)
	@Override
	final void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aro", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 47)
	@Override
	final void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aro", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 47)
	@Override
	final void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aro", name = "fd", descriptor = "(I)V", line = 51)
	@Override
	final void method24142() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aro", name = "gr", descriptor = "()V", line = 51)
	@Override
	final void method24136() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aro", name = "gj", descriptor = "()V", line = 51)
	@Override
	final void method24150() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aro", name = "gi", descriptor = "()V", line = 51)
	@Override
	final void method24164() {
		throw new IllegalStateException();
	}
}
