package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anf")
public abstract class Class26_Sub1_Sub5 extends Class26_Sub1 {

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "(Lclient!rp;IIIII)V", line = 8)
	Class26_Sub1_Sub5(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0);
		this.aByte101 = (byte) arg4;
		this.aByte102 = (byte) arg5;
		this.method21436(new Class320((float) arg1, (float) arg2, (float) arg3));
	}

	@OriginalMember(owner = "client!anf", name = "fr", descriptor = "([Lclient!afz;I)I", line = 15)
	@Override
	int method21514(@OriginalArg(0) Class3_Sub15[] arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.method21478((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, arg0);
	}

	@OriginalMember(owner = "client!anf", name = "gl", descriptor = "([Lclient!afz;)I", line = 15)
	@Override
	int method21519(@OriginalArg(0) Class3_Sub15[] arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.method21478((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, arg0);
	}

	@OriginalMember(owner = "client!anf", name = "gs", descriptor = "(Lclient!de;)Z", line = 20)
	@Override
	boolean method21490(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		@Pc(28) Class437 local28 = this.aClass438_23.method28156(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
		return local28 != null && local28.aClass26_Sub1_Sub1_1.aBoolean526 ? this.aClass438_23.aClass444_1.method28317(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, local28.aClass26_Sub1_Sub1_1.method21508() + this.method21508()) : this.aClass438_23.aClass444_1.method28285(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anf", name = "gc", descriptor = "(Lclient!de;)Z", line = 20)
	@Override
	boolean method21498(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		@Pc(28) Class437 local28 = this.aClass438_23.method28156(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
		return local28 != null && local28.aClass26_Sub1_Sub1_1.aBoolean526 ? this.aClass438_23.aClass444_1.method28317(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, local28.aClass26_Sub1_Sub1_1.method21508() + this.method21508()) : this.aClass438_23.aClass444_1.method28285(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anf", name = "gw", descriptor = "(Lclient!de;)Z", line = 20)
	@Override
	boolean method21515(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		@Pc(28) Class437 local28 = this.aClass438_23.method28156(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
		return local28 != null && local28.aClass26_Sub1_Sub1_1.aBoolean526 ? this.aClass438_23.aClass444_1.method28317(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, local28.aClass26_Sub1_Sub1_1.method21508() + this.method21508()) : this.aClass438_23.aClass444_1.method28285(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anf", name = "gf", descriptor = "(Lclient!de;I)Z", line = 20)
	@Override
	boolean method21521(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		@Pc(28) Class437 local28 = this.aClass438_23.method28156(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
		return local28 != null && local28.aClass26_Sub1_Sub1_1.aBoolean526 ? this.aClass438_23.aClass444_1.method28317(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, local28.aClass26_Sub1_Sub1_1.method21508() + this.method21508()) : this.aClass438_23.aClass444_1.method28285(this.aByte101, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anf", name = "gb", descriptor = "()Z", line = 27)
	@Override
	boolean method21518() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}

	@OriginalMember(owner = "client!anf", name = "gy", descriptor = "(B)Z", line = 27)
	@Override
	boolean method21475() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}

	@OriginalMember(owner = "client!anf", name = "gi", descriptor = "()Z", line = 27)
	@Override
	boolean method21517() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}

	@OriginalMember(owner = "client!anf", name = "go", descriptor = "()Z", line = 27)
	@Override
	boolean method21516() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}

	@OriginalMember(owner = "client!anf", name = "fe", descriptor = "()Z", line = 32)
	@Override
	final boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!anf", name = "fw", descriptor = "()Z", line = 32)
	@Override
	final boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!anf", name = "fu", descriptor = "(B)Z", line = 32)
	@Override
	final boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!anf", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 36)
	@Override
	final void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anf", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 36)
	@Override
	final void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anf", name = "fb", descriptor = "(I)V", line = 40)
	@Override
	final void method21469() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anf", name = "fl", descriptor = "()V", line = 40)
	@Override
	final void method21497() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anf", name = "fo", descriptor = "()V", line = 40)
	@Override
	final void method21481() {
		throw new IllegalStateException();
	}
}
