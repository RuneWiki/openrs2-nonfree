package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aer")
public abstract class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!aer", name = "<init>", descriptor = "()V", line = 4)
	Class92_Sub2() {
	}

	@OriginalMember(owner = "client!aer", name = "n", descriptor = "(Lclient!akv;J)V", line = 901)
	static void method23346(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) long arg1) {
		@Pc(9) Class13 local9;
		if (Class589.aString235 != null && Class589.aString235.length() == 6) {
			if (Class589.aBoolean813) {
				local9 = Class13.aClass13_3;
			} else {
				local9 = Class13.aClass13_1;
			}
		} else if (Class638.aClass240_1.method25936(arg1)) {
			local9 = Class13.aClass13_4;
		} else {
			local9 = Class13.aClass13_2;
		}
		arg0.method22403(local9.method36479());
		switch(local9.anInt39 * -1067252193) {
			case 0:
			case 3:
				arg0.method22413(Integer.parseInt(Class589.aString235));
				arg0.anInt3089 += -1387468933;
				break;
			case 1:
				arg0.anInt3089 += -1254908436;
				break;
			case 2:
				arg0.method22417(Class638.aClass240_1.method25937(arg1));
		}
	}

	@OriginalMember(owner = "client!aer", name = "ai", descriptor = "()I")
	public abstract int method23347();

	@OriginalMember(owner = "client!aer", name = "n", descriptor = "()I")
	public abstract int method23348();

	@OriginalMember(owner = "client!aer", name = "a", descriptor = "(II)I")
	public abstract int method23349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aer", name = "m", descriptor = "(II)V")
	abstract void method23350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aer", name = "h", descriptor = "(II)V")
	abstract void method23351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aer", name = "aj", descriptor = "()I")
	public abstract int method23352();

	@OriginalMember(owner = "client!aer", name = "ao", descriptor = "(II)I")
	public abstract int method23353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aer", name = "al", descriptor = "()I")
	public abstract int method23354();

	@OriginalMember(owner = "client!aer", name = "ag", descriptor = "()I")
	public abstract int method23355();
}
