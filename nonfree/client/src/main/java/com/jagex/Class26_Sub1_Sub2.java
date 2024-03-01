package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anh")
public abstract class Class26_Sub1_Sub2 extends Class26_Sub1 {

	@OriginalMember(owner = "client!anh", name = "m", descriptor = "I")
	int anInt1209 = 0;

	@OriginalMember(owner = "client!anh", name = "v", descriptor = "[Lclient!afz;")
	Class3_Sub15[] aClass3_Sub15Array14 = new Class3_Sub15[4];

	@OriginalMember(owner = "client!anh", name = "q", descriptor = "S")
	public short aShort60;

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(Lclient!rp;IIIIII)V", line = 12)
	Class26_Sub1_Sub2(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0);
		this.aByte101 = (byte) arg4;
		this.aByte102 = (byte) arg5;
		this.aShort60 = (short) arg6;
		this.method21436(new Class320((float) arg1, (float) arg2, (float) arg3));
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			this.aClass3_Sub15Array14[local34] = null;
		}
	}

	@OriginalMember(owner = "client!anh", name = "fr", descriptor = "([Lclient!afz;I)I", line = 21)
	@Override
	int method21514(@OriginalArg(0) Class3_Sub15[] arg0) {
		if (this.aBoolean524) {
			@Pc(6) Class320 local6 = this.method21431().aClass320_61;
			this.anInt1209 = this.method21478((int) local6.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local6.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.aClass3_Sub15Array14) * 567218039;
			this.aBoolean524 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1209 * -194217401; local38++) {
			arg0[local38] = this.aClass3_Sub15Array14[local38];
		}
		return this.anInt1209 * -194217401;
	}

	@OriginalMember(owner = "client!anh", name = "gl", descriptor = "([Lclient!afz;)I", line = 21)
	@Override
	int method21519(@OriginalArg(0) Class3_Sub15[] arg0) {
		if (this.aBoolean524) {
			@Pc(6) Class320 local6 = this.method21431().aClass320_61;
			this.anInt1209 = this.method21478((int) local6.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local6.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935, this.aClass3_Sub15Array14) * 567218039;
			this.aBoolean524 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1209 * -194217401; local38++) {
			arg0[local38] = this.aClass3_Sub15Array14[local38];
		}
		return this.anInt1209 * -194217401;
	}

	@OriginalMember(owner = "client!anh", name = "gw", descriptor = "(Lclient!de;)Z", line = 31)
	@Override
	boolean method21515(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28285(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anh", name = "gs", descriptor = "(Lclient!de;)Z", line = 31)
	@Override
	boolean method21490(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28285(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anh", name = "gf", descriptor = "(Lclient!de;I)Z", line = 31)
	@Override
	boolean method21521(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28285(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anh", name = "gc", descriptor = "(Lclient!de;)Z", line = 31)
	@Override
	boolean method21498(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28285(this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anh", name = "gy", descriptor = "(B)Z", line = 36)
	@Override
	boolean method21475() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}

	@OriginalMember(owner = "client!anh", name = "gi", descriptor = "()Z", line = 36)
	@Override
	boolean method21517() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}

	@OriginalMember(owner = "client!anh", name = "go", descriptor = "()Z", line = 36)
	@Override
	boolean method21516() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}

	@OriginalMember(owner = "client!anh", name = "gb", descriptor = "()Z", line = 36)
	@Override
	boolean method21518() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515)][this.aClass438_23.anInt4912 * 555856565 + (((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469)];
	}
}
