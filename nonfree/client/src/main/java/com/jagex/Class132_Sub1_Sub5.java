package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ast")
public abstract class Class132_Sub1_Sub5 extends Class132_Sub1 {

	@OriginalMember(owner = "client!ast", name = "<init>", descriptor = "(Lclient!tx;IIIII)V", line = 8)
	Class132_Sub1_Sub5(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.method24224(new Class472((float) arg1, (float) arg2, (float) arg3));
	}

	@OriginalMember(owner = "client!ast", name = "gy", descriptor = "([Lclient!akf;S)I", line = 15)
	@Override
	int method24309(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.method24274((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, arg0);
	}

	@OriginalMember(owner = "client!ast", name = "gm", descriptor = "([Lclient!akf;)I", line = 15)
	@Override
	int method24302(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.method24274((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, arg0);
	}

	@OriginalMember(owner = "client!ast", name = "gv", descriptor = "([Lclient!akf;)I", line = 15)
	@Override
	int method24264(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.method24274((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, arg0);
	}

	@OriginalMember(owner = "client!ast", name = "ga", descriptor = "(Lclient!dh;S)Z", line = 20)
	@Override
	boolean method24270(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		@Pc(28) Class590 local28 = this.aClass585_23.method31467(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
		return local28 != null && local28.aClass132_Sub1_Sub1_1.aBoolean562 ? this.aClass585_23.aClass598_2.method31818(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, local28.aClass132_Sub1_Sub1_1.method24289() + this.method24289()) : this.aClass585_23.aClass598_2.method31795(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
	}

	@OriginalMember(owner = "client!ast", name = "gj", descriptor = "(Lclient!dh;)Z", line = 20)
	@Override
	boolean method24304(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		@Pc(28) Class590 local28 = this.aClass585_23.method31467(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
		return local28 != null && local28.aClass132_Sub1_Sub1_1.aBoolean562 ? this.aClass585_23.aClass598_2.method31818(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, local28.aClass132_Sub1_Sub1_1.method24289() + this.method24289()) : this.aClass585_23.aClass598_2.method31795(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
	}

	@OriginalMember(owner = "client!ast", name = "gn", descriptor = "(I)Z", line = 27)
	@Override
	boolean method24273() {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659)][((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925];
	}

	@OriginalMember(owner = "client!ast", name = "gw", descriptor = "()Z", line = 27)
	@Override
	boolean method24258() {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659)][((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925];
	}

	@OriginalMember(owner = "client!ast", name = "fp", descriptor = "(I)Z", line = 32)
	@Override
	final boolean method24261() {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "fh", descriptor = "()Z", line = 32)
	@Override
	final boolean method24272() {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "fr", descriptor = "()Z", line = 32)
	@Override
	final boolean method24292() {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 36)
	@Override
	final void method24296(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 36)
	@Override
	final void method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 36)
	@Override
	final void method24295(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 36)
	@Override
	final void method24269(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "ff", descriptor = "(B)V", line = 40)
	@Override
	final void method24265() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "go", descriptor = "()V", line = 40)
	@Override
	final void method24257() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gk", descriptor = "()V", line = 40)
	@Override
	final void method24297() {
		throw new IllegalStateException();
	}
}
