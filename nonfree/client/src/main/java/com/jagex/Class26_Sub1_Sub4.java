package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anv")
public abstract class Class26_Sub1_Sub4 extends Class26_Sub1 {

	@OriginalMember(owner = "client!anv", name = "v", descriptor = "I")
	int anInt1211 = 0;

	@OriginalMember(owner = "client!anv", name = "t", descriptor = "[Lclient!afz;")
	Class3_Sub15[] aClass3_Sub15Array15 = new Class3_Sub15[4];

	@OriginalMember(owner = "client!anv", name = "q", descriptor = "S")
	protected short aShort62;

	@OriginalMember(owner = "client!anv", name = "m", descriptor = "S")
	protected short aShort61;

	@OriginalMember(owner = "client!anv", name = "<init>", descriptor = "(Lclient!rp;IIIIIII)V", line = 13)
	Class26_Sub1_Sub4(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0);
		this.aByte101 = (byte) arg4;
		this.aByte102 = (byte) arg5;
		this.aShort62 = (short) arg6;
		this.aShort61 = (short) arg7;
		this.method21436(new Class320((float) arg1, (float) arg2, (float) arg3));
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass3_Sub15Array15[local38] = null;
		}
	}

	@OriginalMember(owner = "client!anv", name = "fr", descriptor = "([Lclient!afz;I)I", line = 23)
	@Override
	int method21514(@OriginalArg(0) Class3_Sub15[] arg0) {
		if (this.aBoolean524) {
			@Pc(6) Class320 local6 = this.method21431().aClass320_61;
			this.anInt1211 = this.method21478((int) local6.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local6.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.aClass3_Sub15Array15) * -1728184381;
			this.aBoolean524 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1211 * 1030056171; local38++) {
			arg0[local38] = this.aClass3_Sub15Array15[local38];
		}
		return this.anInt1211 * 1030056171;
	}

	@OriginalMember(owner = "client!anv", name = "gl", descriptor = "([Lclient!afz;)I", line = 23)
	@Override
	int method21519(@OriginalArg(0) Class3_Sub15[] arg0) {
		if (this.aBoolean524) {
			@Pc(6) Class320 local6 = this.method21431().aClass320_61;
			this.anInt1211 = this.method21478((int) local6.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local6.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.aClass3_Sub15Array15) * -1728184381;
			this.aBoolean524 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1211 * 1030056171; local38++) {
			arg0[local38] = this.aClass3_Sub15Array15[local38];
		}
		return this.anInt1211 * 1030056171;
	}

	@OriginalMember(owner = "client!anv", name = "gf", descriptor = "(Lclient!de;I)Z", line = 33)
	@Override
	boolean method21521(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28317(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.method21508());
	}

	@OriginalMember(owner = "client!anv", name = "gs", descriptor = "(Lclient!de;)Z", line = 33)
	@Override
	boolean method21490(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28317(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.method21508());
	}

	@OriginalMember(owner = "client!anv", name = "gc", descriptor = "(Lclient!de;)Z", line = 33)
	@Override
	boolean method21498(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28317(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.method21508());
	}

	@OriginalMember(owner = "client!anv", name = "gw", descriptor = "(Lclient!de;)Z", line = 33)
	@Override
	boolean method21515(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28317(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.method21508());
	}

	@OriginalMember(owner = "client!anv", name = "gb", descriptor = "()Z", line = 38)
	@Override
	boolean method21518() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}

	@OriginalMember(owner = "client!anv", name = "gy", descriptor = "(B)Z", line = 38)
	@Override
	boolean method21475() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}

	@OriginalMember(owner = "client!anv", name = "gi", descriptor = "()Z", line = 38)
	@Override
	boolean method21517() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}

	@OriginalMember(owner = "client!anv", name = "go", descriptor = "()Z", line = 38)
	@Override
	boolean method21516() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}

	@OriginalMember(owner = "client!anv", name = "fu", descriptor = "(B)Z", line = 43)
	@Override
	final boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!anv", name = "fw", descriptor = "()Z", line = 43)
	@Override
	final boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!anv", name = "fe", descriptor = "()Z", line = 43)
	@Override
	final boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!anv", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 47)
	@Override
	final void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anv", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 47)
	@Override
	final void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anv", name = "fl", descriptor = "()V", line = 51)
	@Override
	final void method21497() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anv", name = "fb", descriptor = "(I)V", line = 51)
	@Override
	final void method21469() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!anv", name = "fo", descriptor = "()V", line = 51)
	@Override
	final void method21481() {
		throw new IllegalStateException();
	}
}
