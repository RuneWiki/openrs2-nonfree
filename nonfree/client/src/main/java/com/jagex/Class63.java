package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public abstract class Class63 {

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
	static final int anInt1513 = 4;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	static final int anInt1514 = 8;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
	static final int anInt1516 = 1;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
	static final int anInt1517 = 2;

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
	int anInt1511;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
	public int anInt1512;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
	public int anInt1515;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V", line = 12)
	Class63() {
	}

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(I)Z", line = 15)
	public boolean method13038() {
		return (this.anInt1515 * -1021417267 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "()Z", line = 19)
	public boolean method13037() {
		return (this.anInt1515 * -1021417267 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "()Z", line = 19)
	public boolean method13041() {
		return (this.anInt1515 * -1021417267 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "()Z", line = 19)
	public boolean method13042() {
		return (this.anInt1515 * -1021417267 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)Z", line = 19)
	public boolean method13043() {
		return (this.anInt1515 * -1021417267 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "(I)[Lclient!wv;", line = 21)
	public static Class563[] method13052() {
		return new Class563[] { Class563.aClass563_2, Class563.aClass563_3, Class563.aClass563_8, Class563.aClass563_10, Class563.aClass563_11, Class563.aClass563_7, Class563.aClass563_9, Class563.aClass563_6, Class563.aClass563_5, Class563.aClass563_4 };
	}

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(B)Z", line = 23)
	public boolean method13039() {
		return (this.anInt1515 * -1021417267 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "()Z", line = 23)
	public boolean method13044() {
		return (this.anInt1515 * -1021417267 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "()Z", line = 23)
	public boolean method13045() {
		return (this.anInt1515 * -1021417267 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "(B)Z", line = 27)
	public boolean method13040() {
		return (this.anInt1515 * -1021417267 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "()Z", line = 27)
	public boolean method13046() {
		return (this.anInt1515 * -1021417267 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "()Z", line = 27)
	public boolean method13047() {
		return (this.anInt1515 * -1021417267 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "()Z", line = 27)
	public boolean method13048() {
		return (this.anInt1515 * -1021417267 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "()Z", line = 27)
	public boolean method13049() {
		return (this.anInt1515 * -1021417267 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "yn", descriptor = "(Lclient!vs;I)V", line = 8452)
	static final void method13050(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local13.startsWith(Class301.method25664(0)) || local13.startsWith(Class301.method25664(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class34_Sub1.method16502(local13) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tu", name = "aoo", descriptor = "(Lclient!vs;B)V", line = 11627)
	static final void method13051(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub8_1.method13313();
	}
}
