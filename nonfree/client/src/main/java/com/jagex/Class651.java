package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xp")
public class Class651 {

	@OriginalMember(owner = "client!xp", name = "l", descriptor = "F")
	float aFloat331;

	@OriginalMember(owner = "client!xp", name = "c", descriptor = "F")
	float aFloat332;

	@OriginalMember(owner = "client!xp", name = "s", descriptor = "I")
	int anInt5742;

	@OriginalMember(owner = "client!xp", name = "y", descriptor = "Lclient!oo;")
	Class447 aClass447_65;

	@OriginalMember(owner = "client!xp", name = "w", descriptor = "I")
	int anInt5743;

	@OriginalMember(owner = "client!xp", name = "t", descriptor = "I")
	int anInt5744;

	@OriginalMember(owner = "client!xp", name = "q", descriptor = "F")
	float aFloat333;

	@OriginalMember(owner = "client!xp", name = "x", descriptor = "F")
	float aFloat334;

	@OriginalMember(owner = "client!xp", name = "p", descriptor = "I")
	int anInt5745;

	@OriginalMember(owner = "client!xp", name = "r", descriptor = "I")
	int anInt5746;

	@OriginalMember(owner = "client!xp", name = "g", descriptor = "I")
	int anInt5747;

	@OriginalMember(owner = "client!xp", name = "z", descriptor = "I")
	int anInt5748;

	@OriginalMember(owner = "client!xp", name = "v", descriptor = "F")
	float aFloat335;

	@OriginalMember(owner = "client!xp", name = "j", descriptor = "I")
	int anInt5749;

	@OriginalMember(owner = "client!xp", name = "i", descriptor = "I")
	int anInt5750;

	@OriginalMember(owner = "client!xp", name = "d", descriptor = "F")
	float aFloat336;

	@OriginalMember(owner = "client!xp", name = "e", descriptor = "I")
	int anInt5751;

	@OriginalMember(owner = "client!xp", name = "k", descriptor = "[I")
	int[] anIntArray529 = new int[3];

	@OriginalMember(owner = "client!xp", name = "u", descriptor = "[F")
	float[] aFloatArray117 = new float[3];

	@OriginalMember(owner = "client!xp", name = "p", descriptor = "(B)V", line = 16)
	public static void method32889() {
		Class64.aClass695_1 = new Class695();
	}

	@OriginalMember(owner = "client!xp", name = "y", descriptor = "(I)Lclient!aiw;", line = 19)
	static Class131_Sub4 method32890() {
		@Pc(4) Class131_Sub4 local4 = (Class131_Sub4) Class131_Sub4.aClass703_2.method36532();
		if (local4 == null) {
			return new Class131_Sub4();
		} else {
			Class131_Sub4.anInt1438 -= 816205627;
			return local4;
		}
	}

	@OriginalMember(owner = "client!xp", name = "<init>", descriptor = "()V", line = 28)
	public Class651() {
		this.method32892();
	}

	@OriginalMember(owner = "client!xp", name = "b", descriptor = "()V", line = 33)
	void method32891() {
		this.anInt5745 = 1689948605;
		this.aFloat332 = -1.0F;
		this.aFloat335 = -1.0F;
		this.aFloat331 = -1.0F;
		this.aClass447_65 = null;
		this.anInt5743 = 673554397;
		this.anInt5744 = -1162994453;
		this.aFloat333 = -1.0F;
		this.aFloat334 = -1.0F;
		this.aFloat336 = -1.0F;
		this.anInt5742 = 1175870517;
		this.anInt5746 = -1149517419;
		this.anInt5747 = 669073583;
		this.anInt5748 = 1754948975;
		this.anInt5749 = -758504603;
		this.anInt5750 = 1063533015;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray529.length; local49++) {
			this.anIntArray529[local49] = -1;
			this.aFloatArray117[local49] = 0.0F;
		}
		this.anInt5751 = -1214115384;
	}

	@OriginalMember(owner = "client!xp", name = "p", descriptor = "(I)V", line = 33)
	void method32892() {
		this.anInt5745 = 1689948605;
		this.aFloat332 = -1.0F;
		this.aFloat335 = -1.0F;
		this.aFloat331 = -1.0F;
		this.aClass447_65 = null;
		this.anInt5743 = 673554397;
		this.anInt5744 = -1162994453;
		this.aFloat333 = -1.0F;
		this.aFloat334 = -1.0F;
		this.aFloat336 = -1.0F;
		this.anInt5742 = 1175870517;
		this.anInt5746 = -1149517419;
		this.anInt5747 = 669073583;
		this.anInt5748 = 1754948975;
		this.anInt5749 = -758504603;
		this.anInt5750 = 1063533015;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray529.length; local49++) {
			this.anIntArray529[local49] = -1;
			this.aFloatArray117[local49] = 0.0F;
		}
		this.anInt5751 = -1214115384;
	}

	@OriginalMember(owner = "client!xp", name = "w", descriptor = "(Lclient!yf;B)V", line = 40)
	static void method32893(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class283.method26702();
	}

	@OriginalMember(owner = "client!xp", name = "c", descriptor = "(Lclient!akv;I)Z", line = 57)
	public boolean method32894(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22483();
		if (local3 == 0) {
			this.anInt5751 = arg0.method22483() * -1328246711;
			return false;
		}
		if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) != 0) {
			this.anInt5745 = arg0.method22500() * -1689948605;
		}
		if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) != 0) {
			this.aFloat332 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) != 0) {
			this.aFloat335 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) != 0) {
			this.aFloat331 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_5.anInt5722 * 522594405) != 0) {
			this.aClass447_65 = Class447.method29127(arg0);
		}
		if ((local3 & Class642.aClass642_12.anInt5722 * 522594405) != 0) {
			this.anInt5743 = arg0.method22500() * -673554397;
		}
		if ((local3 & Class642.aClass642_11.anInt5722 * 522594405) != 0) {
			this.anInt5744 = arg0.method22483() * 1162994453;
		}
		if ((local3 & Class642.aClass642_7.anInt5722 * 522594405) != 0) {
			this.anInt5742 = arg0.method22483() * -1175870517;
		}
		if ((local3 & Class642.aClass642_8.anInt5722 * 522594405) != 0) {
			this.aFloat333 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_9.anInt5722 * 522594405) != 0) {
			this.aFloat334 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_21.anInt5722 * 522594405) != 0) {
			this.aFloat336 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_18.anInt5722 * 522594405) != 0) {
			this.anInt5746 = arg0.method22483() * 1149517419;
			this.anInt5747 = arg0.method22487() * -669073583;
			this.anInt5748 = arg0.method22487() * -1754948975;
			this.anInt5749 = arg0.method22487() * 758504603;
			this.anInt5750 = arg0.method22483() * -1063533015;
		}
		if ((local3 & Class642.aClass642_24.anInt5722 * 522594405) != 0) {
			this.anIntArray529[0] = arg0.method22483();
			this.aFloatArray117[0] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_13.anInt5722 * 522594405) != 0) {
			this.anIntArray529[1] = arg0.method22483();
			this.aFloatArray117[1] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_25.anInt5722 * 522594405) != 0) {
			this.anIntArray529[2] = arg0.method22483();
			this.aFloatArray117[2] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_15.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_16.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_17.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_23.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_19.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_1.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_20.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_22.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_10.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		if ((local3 & Class642.aClass642_14.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		this.anInt5751 = arg0.method22483() * -1328246711;
		return true;
	}

	@OriginalMember(owner = "client!xp", name = "a", descriptor = "(Lclient!akv;)Z", line = 57)
	public boolean method32895(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22483();
		if (local3 == 0) {
			this.anInt5751 = arg0.method22483() * -1328246711;
			return false;
		}
		if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) != 0) {
			this.anInt5745 = arg0.method22500() * -1689948605;
		}
		if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) != 0) {
			this.aFloat332 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) != 0) {
			this.aFloat335 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) != 0) {
			this.aFloat331 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_5.anInt5722 * 522594405) != 0) {
			this.aClass447_65 = Class447.method29127(arg0);
		}
		if ((local3 & Class642.aClass642_12.anInt5722 * 522594405) != 0) {
			this.anInt5743 = arg0.method22500() * -673554397;
		}
		if ((local3 & Class642.aClass642_11.anInt5722 * 522594405) != 0) {
			this.anInt5744 = arg0.method22483() * 1162994453;
		}
		if ((local3 & Class642.aClass642_7.anInt5722 * 522594405) != 0) {
			this.anInt5742 = arg0.method22483() * -1175870517;
		}
		if ((local3 & Class642.aClass642_8.anInt5722 * 522594405) != 0) {
			this.aFloat333 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_9.anInt5722 * 522594405) != 0) {
			this.aFloat334 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_21.anInt5722 * 522594405) != 0) {
			this.aFloat336 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_18.anInt5722 * 522594405) != 0) {
			this.anInt5746 = arg0.method22483() * 1149517419;
			this.anInt5747 = arg0.method22487() * -669073583;
			this.anInt5748 = arg0.method22487() * -1754948975;
			this.anInt5749 = arg0.method22487() * 758504603;
			this.anInt5750 = arg0.method22483() * -1063533015;
		}
		if ((local3 & Class642.aClass642_24.anInt5722 * 522594405) != 0) {
			this.anIntArray529[0] = arg0.method22483();
			this.aFloatArray117[0] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_13.anInt5722 * 522594405) != 0) {
			this.anIntArray529[1] = arg0.method22483();
			this.aFloatArray117[1] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_25.anInt5722 * 522594405) != 0) {
			this.anIntArray529[2] = arg0.method22483();
			this.aFloatArray117[2] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_15.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_16.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_17.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_23.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_19.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_1.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_20.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_22.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_10.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		if ((local3 & Class642.aClass642_14.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		this.anInt5751 = arg0.method22483() * -1328246711;
		return true;
	}

	@OriginalMember(owner = "client!xp", name = "n", descriptor = "(Lclient!akv;)Z", line = 57)
	public boolean method32896(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22483();
		if (local3 == 0) {
			this.anInt5751 = arg0.method22483() * -1328246711;
			return false;
		}
		if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) != 0) {
			this.anInt5745 = arg0.method22500() * -1689948605;
		}
		if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) != 0) {
			this.aFloat332 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) != 0) {
			this.aFloat335 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) != 0) {
			this.aFloat331 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_5.anInt5722 * 522594405) != 0) {
			this.aClass447_65 = Class447.method29127(arg0);
		}
		if ((local3 & Class642.aClass642_12.anInt5722 * 522594405) != 0) {
			this.anInt5743 = arg0.method22500() * -673554397;
		}
		if ((local3 & Class642.aClass642_11.anInt5722 * 522594405) != 0) {
			this.anInt5744 = arg0.method22483() * 1162994453;
		}
		if ((local3 & Class642.aClass642_7.anInt5722 * 522594405) != 0) {
			this.anInt5742 = arg0.method22483() * -1175870517;
		}
		if ((local3 & Class642.aClass642_8.anInt5722 * 522594405) != 0) {
			this.aFloat333 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_9.anInt5722 * 522594405) != 0) {
			this.aFloat334 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_21.anInt5722 * 522594405) != 0) {
			this.aFloat336 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_18.anInt5722 * 522594405) != 0) {
			this.anInt5746 = arg0.method22483() * 1149517419;
			this.anInt5747 = arg0.method22487() * -669073583;
			this.anInt5748 = arg0.method22487() * -1754948975;
			this.anInt5749 = arg0.method22487() * 758504603;
			this.anInt5750 = arg0.method22483() * -1063533015;
		}
		if ((local3 & Class642.aClass642_24.anInt5722 * 522594405) != 0) {
			this.anIntArray529[0] = arg0.method22483();
			this.aFloatArray117[0] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_13.anInt5722 * 522594405) != 0) {
			this.anIntArray529[1] = arg0.method22483();
			this.aFloatArray117[1] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_25.anInt5722 * 522594405) != 0) {
			this.anIntArray529[2] = arg0.method22483();
			this.aFloatArray117[2] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_15.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_16.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_17.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_23.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_19.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_1.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_20.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_22.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_10.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		if ((local3 & Class642.aClass642_14.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		this.anInt5751 = arg0.method22483() * -1328246711;
		return true;
	}

	@OriginalMember(owner = "client!xp", name = "m", descriptor = "(Lclient!akv;)Z", line = 57)
	public boolean method32897(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22483();
		if (local3 == 0) {
			this.anInt5751 = arg0.method22483() * -1328246711;
			return false;
		}
		if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) != 0) {
			this.anInt5745 = arg0.method22500() * -1689948605;
		}
		if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) != 0) {
			this.aFloat332 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) != 0) {
			this.aFloat335 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) != 0) {
			this.aFloat331 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_5.anInt5722 * 522594405) != 0) {
			this.aClass447_65 = Class447.method29127(arg0);
		}
		if ((local3 & Class642.aClass642_12.anInt5722 * 522594405) != 0) {
			this.anInt5743 = arg0.method22500() * -673554397;
		}
		if ((local3 & Class642.aClass642_11.anInt5722 * 522594405) != 0) {
			this.anInt5744 = arg0.method22483() * 1162994453;
		}
		if ((local3 & Class642.aClass642_7.anInt5722 * 522594405) != 0) {
			this.anInt5742 = arg0.method22483() * -1175870517;
		}
		if ((local3 & Class642.aClass642_8.anInt5722 * 522594405) != 0) {
			this.aFloat333 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_9.anInt5722 * 522594405) != 0) {
			this.aFloat334 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_21.anInt5722 * 522594405) != 0) {
			this.aFloat336 = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_18.anInt5722 * 522594405) != 0) {
			this.anInt5746 = arg0.method22483() * 1149517419;
			this.anInt5747 = arg0.method22487() * -669073583;
			this.anInt5748 = arg0.method22487() * -1754948975;
			this.anInt5749 = arg0.method22487() * 758504603;
			this.anInt5750 = arg0.method22483() * -1063533015;
		}
		if ((local3 & Class642.aClass642_24.anInt5722 * 522594405) != 0) {
			this.anIntArray529[0] = arg0.method22483();
			this.aFloatArray117[0] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_13.anInt5722 * 522594405) != 0) {
			this.anIntArray529[1] = arg0.method22483();
			this.aFloatArray117[1] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_25.anInt5722 * 522594405) != 0) {
			this.anIntArray529[2] = arg0.method22483();
			this.aFloatArray117[2] = arg0.method22517();
		}
		if ((local3 & Class642.aClass642_15.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_16.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_17.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_23.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_19.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_1.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_20.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_22.anInt5722 * 522594405) != 0) {
			arg0.method22517();
		}
		if ((local3 & Class642.aClass642_10.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		if ((local3 & Class642.aClass642_14.anInt5722 * 522594405) != 0) {
			arg0.method22500();
		}
		this.anInt5751 = arg0.method22483() * -1328246711;
		return true;
	}

	@OriginalMember(owner = "client!xp", name = "z", descriptor = "(II)V", line = 132)
	public static void method32898(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(10, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!xp", name = "al", descriptor = "()I", line = 149)
	public int method32899() {
		return this.anInt5745 * 304860779;
	}

	@OriginalMember(owner = "client!xp", name = "v", descriptor = "(I)I", line = 149)
	public int method32900() {
		return this.anInt5745 * 304860779;
	}

	@OriginalMember(owner = "client!xp", name = "h", descriptor = "()I", line = 149)
	public int method32901() {
		return this.anInt5745 * 304860779;
	}

	@OriginalMember(owner = "client!xp", name = "aj", descriptor = "()I", line = 149)
	public int method32902() {
		return this.anInt5745 * 304860779;
	}

	@OriginalMember(owner = "client!xp", name = "ai", descriptor = "()I", line = 149)
	public int method32903() {
		return this.anInt5745 * 304860779;
	}

	@OriginalMember(owner = "client!xp", name = "ag", descriptor = "()I", line = 149)
	public int method32904() {
		return this.anInt5745 * 304860779;
	}

	@OriginalMember(owner = "client!xp", name = "ao", descriptor = "()F", line = 153)
	public float method32905() {
		return this.aFloat332;
	}

	@OriginalMember(owner = "client!xp", name = "au", descriptor = "()F", line = 153)
	public float method32906() {
		return this.aFloat332;
	}

	@OriginalMember(owner = "client!xp", name = "ak", descriptor = "()F", line = 153)
	public float method32907() {
		return this.aFloat332;
	}

	@OriginalMember(owner = "client!xp", name = "l", descriptor = "(I)F", line = 153)
	public float method32908() {
		return this.aFloat332;
	}

	@OriginalMember(owner = "client!xp", name = "y", descriptor = "(S)F", line = 157)
	public float method32909() {
		return this.aFloat335;
	}

	@OriginalMember(owner = "client!xp", name = "ar", descriptor = "()F", line = 157)
	public float method32910() {
		return this.aFloat335;
	}

	@OriginalMember(owner = "client!xp", name = "ax", descriptor = "()F", line = 157)
	public float method32911() {
		return this.aFloat335;
	}

	@OriginalMember(owner = "client!xp", name = "w", descriptor = "(B)F", line = 161)
	public float method32912() {
		return this.aFloat331;
	}

	@OriginalMember(owner = "client!xp", name = "t", descriptor = "(B)Lclient!oo;", line = 165)
	public Class447 method32913() {
		return this.aClass447_65;
	}

	@OriginalMember(owner = "client!xp", name = "ad", descriptor = "()Lclient!oo;", line = 165)
	public Class447 method32914() {
		return this.aClass447_65;
	}

	@OriginalMember(owner = "client!xp", name = "q", descriptor = "(B)I", line = 169)
	public int method32915() {
		return this.anInt5743 * 249646987;
	}

	@OriginalMember(owner = "client!xp", name = "ac", descriptor = "()I", line = 169)
	public int method32916() {
		return this.anInt5743 * 249646987;
	}

	@OriginalMember(owner = "client!xp", name = "av", descriptor = "()I", line = 169)
	public int method32917() {
		return this.anInt5743 * 249646987;
	}

	@OriginalMember(owner = "client!xp", name = "at", descriptor = "()I", line = 169)
	public int method32918() {
		return this.anInt5743 * 249646987;
	}

	@OriginalMember(owner = "client!xp", name = "x", descriptor = "(B)I", line = 173)
	public int method32919() {
		return this.anInt5744 * 1871860797;
	}

	@OriginalMember(owner = "client!xp", name = "ae", descriptor = "()I", line = 173)
	public int method32920() {
		return this.anInt5744 * 1871860797;
	}

	@OriginalMember(owner = "client!xp", name = "as", descriptor = "()F", line = 177)
	public float method32921() {
		return this.aFloat333;
	}

	@OriginalMember(owner = "client!xp", name = "ah", descriptor = "()F", line = 177)
	public float method32922() {
		return this.aFloat333;
	}

	@OriginalMember(owner = "client!xp", name = "d", descriptor = "(I)F", line = 177)
	public float method32923() {
		return this.aFloat333;
	}

	@OriginalMember(owner = "client!xp", name = "s", descriptor = "(I)F", line = 181)
	public float method32924() {
		return this.aFloat334;
	}

	@OriginalMember(owner = "client!xp", name = "ay", descriptor = "()F", line = 181)
	public float method32925() {
		return this.aFloat334;
	}

	@OriginalMember(owner = "client!xp", name = "am", descriptor = "()F", line = 181)
	public float method32926() {
		return this.aFloat334;
	}

	@OriginalMember(owner = "client!xp", name = "aq", descriptor = "()F", line = 181)
	public float method32927() {
		return this.aFloat334;
	}

	@OriginalMember(owner = "client!xp", name = "r", descriptor = "(I)F", line = 185)
	public float method32928() {
		return this.aFloat336;
	}

	@OriginalMember(owner = "client!xp", name = "af", descriptor = "()F", line = 185)
	public float method32929() {
		return this.aFloat336;
	}

	@OriginalMember(owner = "client!xp", name = "g", descriptor = "(B)I", line = 189)
	public int method32930() {
		return this.anInt5742 * 121694691;
	}

	@OriginalMember(owner = "client!xp", name = "an", descriptor = "()I", line = 189)
	public int method32931() {
		return this.anInt5742 * 121694691;
	}

	@OriginalMember(owner = "client!xp", name = "ab", descriptor = "()I", line = 189)
	public int method32932() {
		return this.anInt5742 * 121694691;
	}

	@OriginalMember(owner = "client!xp", name = "z", descriptor = "(B)I", line = 193)
	public int method32933() {
		return this.anInt5746 * -993952189;
	}

	@OriginalMember(owner = "client!xp", name = "aa", descriptor = "()I", line = 193)
	public int method32934() {
		return this.anInt5746 * -993952189;
	}

	@OriginalMember(owner = "client!xp", name = "j", descriptor = "(I)I", line = 197)
	public int method32935() {
		return this.anInt5747 * 126740913;
	}

	@OriginalMember(owner = "client!xp", name = "ap", descriptor = "()I", line = 197)
	public int method32936() {
		return this.anInt5747 * 126740913;
	}

	@OriginalMember(owner = "client!xp", name = "i", descriptor = "(I)I", line = 201)
	public int method32937() {
		return this.anInt5748 * -1241422223;
	}

	@OriginalMember(owner = "client!xp", name = "aw", descriptor = "()I", line = 201)
	public int method32938() {
		return this.anInt5748 * -1241422223;
	}

	@OriginalMember(owner = "client!xp", name = "az", descriptor = "()I", line = 201)
	public int method32939() {
		return this.anInt5748 * -1241422223;
	}

	@OriginalMember(owner = "client!xp", name = "bc", descriptor = "()I", line = 201)
	public int method32940() {
		return this.anInt5748 * -1241422223;
	}

	@OriginalMember(owner = "client!xp", name = "k", descriptor = "(B)I", line = 205)
	public int method32941() {
		return this.anInt5749 * -783242861;
	}

	@OriginalMember(owner = "client!xp", name = "bv", descriptor = "()I", line = 205)
	public int method32942() {
		return this.anInt5749 * -783242861;
	}

	@OriginalMember(owner = "client!xp", name = "bj", descriptor = "()I", line = 205)
	public int method32943() {
		return this.anInt5749 * -783242861;
	}

	@OriginalMember(owner = "client!xp", name = "u", descriptor = "(I)I", line = 209)
	public int method32944() {
		return this.anInt5750 * -1430964711;
	}

	@OriginalMember(owner = "client!xp", name = "e", descriptor = "(II)I", line = 213)
	public int method32945(@OriginalArg(0) int arg0) {
		return this.anIntArray529[arg0];
	}

	@OriginalMember(owner = "client!xp", name = "ba", descriptor = "(I)I", line = 213)
	public int method32946(@OriginalArg(0) int arg0) {
		return this.anIntArray529[arg0];
	}

	@OriginalMember(owner = "client!xp", name = "f", descriptor = "(II)F", line = 217)
	public float method32947(@OriginalArg(0) int arg0) {
		return this.aFloatArray117[arg0];
	}

	@OriginalMember(owner = "client!xp", name = "bd", descriptor = "(I)F", line = 217)
	public float method32948(@OriginalArg(0) int arg0) {
		return this.aFloatArray117[arg0];
	}

	@OriginalMember(owner = "client!xp", name = "bl", descriptor = "(I)F", line = 217)
	public float method32949(@OriginalArg(0) int arg0) {
		return this.aFloatArray117[arg0];
	}

	@OriginalMember(owner = "client!xp", name = "bb", descriptor = "(I)F", line = 217)
	public float method32950(@OriginalArg(0) int arg0) {
		return this.aFloatArray117[arg0];
	}

	@OriginalMember(owner = "client!xp", name = "o", descriptor = "(B)I", line = 221)
	public int method32951() {
		return this.anInt5751 * 1777623545;
	}

	@OriginalMember(owner = "client!xp", name = "by", descriptor = "()I", line = 221)
	public int method32952() {
		return this.anInt5751 * 1777623545;
	}

	@OriginalMember(owner = "client!xp", name = "as", descriptor = "(IIIB)V", line = 253)
	static void method32953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(9, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
		local4.anInt2953 = arg2 * -1621355885;
	}

	@OriginalMember(owner = "client!xp", name = "h", descriptor = "(B)Z", line = 880)
	static boolean method32954() {
		return Class683.anInt5826 * 324852453 > 0;
	}

	@OriginalMember(owner = "client!xp", name = "nn", descriptor = "(Lclient!yf;I)V", line = 6905)
	static final void method32955(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class586.method31731(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xp", name = "amf", descriptor = "(Lclient!yf;B)V", line = 11765)
	static final void method32956(@OriginalArg(0) Class665 arg0) {
		@Pc(13) float local13 = Class436.method28911(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		@Pc(21) Class77_Sub1_Sub12_Sub1 local21 = new Class77_Sub1_Sub12_Sub1(Class597.aClass107_Sub1_2.method8934(), local13);
		Class597.aClass107_Sub1_2.method8846(local21);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local21.anInt3212 * -997430305;
	}
}
