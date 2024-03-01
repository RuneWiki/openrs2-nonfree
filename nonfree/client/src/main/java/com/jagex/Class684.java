package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yj")
public class Class684 {

	@OriginalMember(owner = "client!yj", name = "iq", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_6;

	@OriginalMember(owner = "client!yj", name = "k", descriptor = "F")
	float aFloat355;

	@OriginalMember(owner = "client!yj", name = "m", descriptor = "F")
	float aFloat356;

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "I")
	int anInt5895;

	@OriginalMember(owner = "client!yj", name = "f", descriptor = "Lclient!ox;")
	Class472 aClass472_66;

	@OriginalMember(owner = "client!yj", name = "w", descriptor = "I")
	int anInt5896;

	@OriginalMember(owner = "client!yj", name = "x", descriptor = "I")
	int anInt5897;

	@OriginalMember(owner = "client!yj", name = "u", descriptor = "F")
	float aFloat357;

	@OriginalMember(owner = "client!yj", name = "n", descriptor = "F")
	float aFloat358;

	@OriginalMember(owner = "client!yj", name = "z", descriptor = "F")
	float aFloat359;

	@OriginalMember(owner = "client!yj", name = "d", descriptor = "I")
	int anInt5898;

	@OriginalMember(owner = "client!yj", name = "c", descriptor = "I")
	int anInt5899;

	@OriginalMember(owner = "client!yj", name = "r", descriptor = "I")
	int anInt5900;

	@OriginalMember(owner = "client!yj", name = "v", descriptor = "I")
	int anInt5901;

	@OriginalMember(owner = "client!yj", name = "o", descriptor = "I")
	int anInt5902;

	@OriginalMember(owner = "client!yj", name = "s", descriptor = "I")
	int anInt5903;

	@OriginalMember(owner = "client!yj", name = "e", descriptor = "I")
	int anInt5904;

	@OriginalMember(owner = "client!yj", name = "p", descriptor = "F")
	float aFloat360;

	@OriginalMember(owner = "client!yj", name = "y", descriptor = "[I")
	int[] anIntArray521 = new int[3];

	@OriginalMember(owner = "client!yj", name = "q", descriptor = "[F")
	float[] aFloatArray122 = new float[3];

	@OriginalMember(owner = "client!yj", name = "<init>", descriptor = "()V", line = 28)
	public Class684() {
		this.method33413();
	}

	@OriginalMember(owner = "client!yj", name = "a", descriptor = "()V", line = 33)
	void method33377() {
		this.anInt5904 = 14325749;
		this.aFloat358 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aClass472_66 = null;
		this.anInt5896 = 1757047085;
		this.anInt5895 = -268363761;
		this.aFloat357 = -1.0F;
		this.aFloat359 = -1.0F;
		this.aFloat360 = -1.0F;
		this.anInt5898 = -304329139;
		this.anInt5899 = -972166225;
		this.anInt5900 = 535776559;
		this.anInt5901 = 1145348855;
		this.anInt5902 = -1206173817;
		this.anInt5903 = -1258086185;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray521.length; local49++) {
			this.anIntArray521[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5897 = -1299616328;
	}

	@OriginalMember(owner = "client!yj", name = "e", descriptor = "(S)V", line = 33)
	void method33413() {
		this.anInt5904 = 14325749;
		this.aFloat358 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aClass472_66 = null;
		this.anInt5896 = 1757047085;
		this.anInt5895 = -268363761;
		this.aFloat357 = -1.0F;
		this.aFloat359 = -1.0F;
		this.aFloat360 = -1.0F;
		this.anInt5898 = -304329139;
		this.anInt5899 = -972166225;
		this.anInt5900 = 535776559;
		this.anInt5901 = 1145348855;
		this.anInt5902 = -1206173817;
		this.anInt5903 = -1258086185;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray521.length; local49++) {
			this.anIntArray521[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5897 = -1299616328;
	}

	@OriginalMember(owner = "client!yj", name = "n", descriptor = "(Lclient!alw;I)Z", line = 57)
	public boolean method33361(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) long local3 = arg0.method22423();
		if (local3 == 0L) {
			this.anInt5897 = arg0.method22415() * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.method22419() * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29531(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.method22419() * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.method22415() * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.method22415() * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.method22415() * 972166225;
			this.anInt5900 = arg0.method22482() * -535776559;
			this.anInt5901 = arg0.method22482() * -1145348855;
			this.anInt5902 = arg0.method22482() * 1206173817;
			this.anInt5903 = arg0.method22415() * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.method22415();
			this.aFloatArray122[0] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.method22415();
			this.aFloatArray122[1] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.method22415();
			this.aFloatArray122[2] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		this.anInt5897 = arg0.method22415() * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "g", descriptor = "(Lclient!alw;)Z", line = 57)
	public boolean method33378(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) long local3 = arg0.method22423();
		if (local3 == 0L) {
			this.anInt5897 = arg0.method22415() * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.method22419() * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29531(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.method22419() * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.method22415() * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.method22415() * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.method22415() * 972166225;
			this.anInt5900 = arg0.method22482() * -535776559;
			this.anInt5901 = arg0.method22482() * -1145348855;
			this.anInt5902 = arg0.method22482() * 1206173817;
			this.anInt5903 = arg0.method22415() * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.method22415();
			this.aFloatArray122[0] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.method22415();
			this.aFloatArray122[1] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.method22415();
			this.aFloatArray122[2] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		this.anInt5897 = arg0.method22415() * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "i", descriptor = "(Lclient!alw;)Z", line = 57)
	public boolean method33379(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) long local3 = arg0.method22423();
		if (local3 == 0L) {
			this.anInt5897 = arg0.method22415() * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.method22419() * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29531(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.method22419() * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.method22415() * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.method22415() * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.method22415() * 972166225;
			this.anInt5900 = arg0.method22482() * -535776559;
			this.anInt5901 = arg0.method22482() * -1145348855;
			this.anInt5902 = arg0.method22482() * 1206173817;
			this.anInt5903 = arg0.method22415() * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.method22415();
			this.aFloatArray122[0] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.method22415();
			this.aFloatArray122[1] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.method22415();
			this.aFloatArray122[2] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		this.anInt5897 = arg0.method22415() * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "j", descriptor = "(Lclient!alw;)Z", line = 57)
	public boolean method33380(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) long local3 = arg0.method22423();
		if (local3 == 0L) {
			this.anInt5897 = arg0.method22415() * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.method22419() * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29531(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.method22419() * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.method22415() * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.method22415() * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.method22415() * 972166225;
			this.anInt5900 = arg0.method22482() * -535776559;
			this.anInt5901 = arg0.method22482() * -1145348855;
			this.anInt5902 = arg0.method22482() * 1206173817;
			this.anInt5903 = arg0.method22415() * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.method22415();
			this.aFloatArray122[0] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.method22415();
			this.aFloatArray122[1] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.method22415();
			this.aFloatArray122[2] = arg0.method22425();
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22425();
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.method22419();
		}
		this.anInt5897 = arg0.method22415() * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "m", descriptor = "(I)I", line = 209)
	public int method33408() {
		return this.anInt5904 * 988275619;
	}

	@OriginalMember(owner = "client!yj", name = "k", descriptor = "(I)F", line = 213)
	public float method33360() {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "t", descriptor = "()F", line = 213)
	public float method33381() {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "ag", descriptor = "()F", line = 213)
	public float method33383() {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "ae", descriptor = "()F", line = 213)
	public float method33405() {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "f", descriptor = "(I)F", line = 217)
	public float method33371() {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!yj", name = "ah", descriptor = "()F", line = 217)
	public float method33392() {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!yj", name = "w", descriptor = "(I)F", line = 221)
	public float method33374() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "ac", descriptor = "()F", line = 221)
	public float method33386() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "ai", descriptor = "()F", line = 221)
	public float method33387() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "al", descriptor = "()F", line = 221)
	public float method33416() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "(I)Lclient!ox;", line = 225)
	public Class472 method33362() {
		return this.aClass472_66;
	}

	@OriginalMember(owner = "client!yj", name = "as", descriptor = "()Lclient!ox;", line = 225)
	public Class472 method33389() {
		return this.aClass472_66;
	}

	@OriginalMember(owner = "client!yj", name = "aw", descriptor = "()Lclient!ox;", line = 225)
	public Class472 method33394() {
		return this.aClass472_66;
	}

	@OriginalMember(owner = "client!yj", name = "at", descriptor = "()I", line = 229)
	public int method33385() {
		return this.anInt5896 * -253284005;
	}

	@OriginalMember(owner = "client!yj", name = "ad", descriptor = "()I", line = 229)
	public int method33388() {
		return this.anInt5896 * -253284005;
	}

	@OriginalMember(owner = "client!yj", name = "u", descriptor = "(I)I", line = 229)
	public int method33401() {
		return this.anInt5896 * -253284005;
	}

	@OriginalMember(owner = "client!yj", name = "ar", descriptor = "()I", line = 233)
	public int method33358() {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "z", descriptor = "(I)I", line = 233)
	public int method33364() {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "am", descriptor = "()I", line = 233)
	public int method33368() {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "au", descriptor = "()I", line = 233)
	public int method33376() {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "p", descriptor = "(I)F", line = 237)
	public float method33365() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "ap", descriptor = "()F", line = 237)
	public float method33395() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "aq", descriptor = "()F", line = 237)
	public float method33396() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "ax", descriptor = "()F", line = 237)
	public float method33397() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "d", descriptor = "(I)F", line = 241)
	public float method33366() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "ao", descriptor = "()F", line = 241)
	public float method33375() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "av", descriptor = "()F", line = 241)
	public float method33398() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "aj", descriptor = "()F", line = 241)
	public float method33400() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "c", descriptor = "(I)F", line = 245)
	public float method33367() {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yj", name = "ay", descriptor = "()F", line = 245)
	public float method33390() {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yj", name = "ab", descriptor = "()F", line = 245)
	public float method33402() {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yj", name = "af", descriptor = "()I", line = 249)
	public int method33356() {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "r", descriptor = "(B)I", line = 249)
	public int method33393() {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "az", descriptor = "()I", line = 249)
	public int method33403() {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "aa", descriptor = "()I", line = 249)
	public int method33404() {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "v", descriptor = "(B)I", line = 253)
	public int method33369() {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "bf", descriptor = "()I", line = 253)
	public int method33384() {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "ak", descriptor = "()I", line = 253)
	public int method33406() {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "an", descriptor = "()I", line = 253)
	public int method33407() {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "bl", descriptor = "()I", line = 257)
	public int method33363() {
		return this.anInt5900 * -2025396687;
	}

	@OriginalMember(owner = "client!yj", name = "o", descriptor = "(I)I", line = 257)
	public int method33370() {
		return this.anInt5900 * -2025396687;
	}

	@OriginalMember(owner = "client!yj", name = "s", descriptor = "(I)I", line = 261)
	public int method33409() {
		return this.anInt5901 * -1365163719;
	}

	@OriginalMember(owner = "client!yj", name = "bk", descriptor = "()I", line = 261)
	public int method33410() {
		return this.anInt5901 * -1365163719;
	}

	@OriginalMember(owner = "client!yj", name = "bh", descriptor = "()I", line = 261)
	public int method33411() {
		return this.anInt5901 * -1365163719;
	}

	@OriginalMember(owner = "client!yj", name = "y", descriptor = "(I)I", line = 265)
	public int method33372() {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "bd", descriptor = "()I", line = 265)
	public int method33382() {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "bx", descriptor = "()I", line = 265)
	public int method33412() {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "bc", descriptor = "()I", line = 265)
	public int method33414() {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "q", descriptor = "(I)I", line = 269)
	public int method33373() {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "bn", descriptor = "()I", line = 269)
	public int method33391() {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "bi", descriptor = "()I", line = 269)
	public int method33415() {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "bt", descriptor = "()I", line = 269)
	public int method33417() {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "x", descriptor = "(II)I", line = 273)
	public int method33399(@OriginalArg(0) int arg0) {
		return this.anIntArray521[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "bq", descriptor = "(I)I", line = 273)
	public int method33418(@OriginalArg(0) int arg0) {
		return this.anIntArray521[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "b", descriptor = "(II)F", line = 277)
	public float method33357(@OriginalArg(0) int arg0) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "bm", descriptor = "(I)F", line = 277)
	public float method33419(@OriginalArg(0) int arg0) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "bb", descriptor = "(I)F", line = 277)
	public float method33420(@OriginalArg(0) int arg0) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "h", descriptor = "(I)I", line = 281)
	public int method33359() {
		return this.anInt5897 * -1431154409;
	}

	@OriginalMember(owner = "client!yj", name = "ff", descriptor = "(B)V", line = 2634)
	static final void method33423() {
		Class682.aClass32_Sub1_3.method17811();
		Class692.aClass32_Sub4_3.method17811();
		Class343.aClass32_Sub19_1.method17811();
		client.aClass532_1.method30466().method17811();
		Class162.aClass32_Sub3_2.method17811();
		Class277.aClass32_Sub12_1.method17811();
		Class32.aClass32_Sub17_23.method17811();
		Class501.aClass32_Sub18_1.method17811();
		Class30.aClass32_Sub16_1.method17811();
		Class21.aClass79_Sub1_Sub1_1.method1421();
		aClass79_Sub1_Sub2_6.method1476();
		Class39.aClass79_Sub1_Sub2_1.method1476();
		Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3.method1476();
		Class429.aClass79_Sub1_Sub2_5.method1476();
		Class265.aClass79_Sub1_Sub2_4.method1476();
		Class166_Sub6.aClass32_Sub5_1.method17811();
		Class466.aClass32_Sub20_3.method17811();
		Class542.aClass32_Sub2_3.method17811();
		Class124.aClass32_Sub21_7.method17811();
		Class123.aClass32_Sub11_2.method17811();
		Class51.aClass32_Sub9_1.method17811();
		Class668.aClass32_Sub15_1.method17811();
		Class311.aClass32_Sub6_1.method17811();
		Class366.aClass32_Sub8_1.method17811();
		Class534.aClass32_Sub10_1.method17811();
		Class546.method30969();
		Class379.method28103();
		Class157.aClass462_2.method29245();
		Class124_Sub1.method9193();
		Class379.method28100();
		client.aClass240_66.method25837();
		client.aClass240_69.method25837();
		Class687.aClass240_96.method25837();
		client.aClass240_70.method25837();
		Class74.aClass32_1.method17811();
		Class276.aClass32_2.method17811();
		client.aClass240_67.method25837();
	}

	@OriginalMember(owner = "client!yj", name = "gu", descriptor = "(IIIB)V", line = 3345)
	static final void method33424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(32) String local32 = "tele " + arg0 + Class430.aString204 + (arg1 >> 6) + Class430.aString204 + (arg2 >> 6) + Class430.aString204 + (arg1 & 0x3F) + Class430.aString204 + (arg2 & 0x3F);
		System.out.println(local32);
		Class32_Sub7.method16823(local32, true, false);
	}

	@OriginalMember(owner = "client!yj", name = "vi", descriptor = "(Lclient!yf;I)V", line = 8797)
	static final void method33425(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(19) Class93_Sub22 local19 = Class102.method2592(Class446.aClass446_103, client.aClass175_2.aClass24_2);
		local19.aClass93_Sub41_Sub2_1.method22510(local13.length() + 1);
		local19.aClass93_Sub41_Sub2_1.method22402(local13);
		client.aClass175_2.method24351(local19);
	}

	@OriginalMember(owner = "client!yj", name = "ame", descriptor = "(Lclient!yf;I)V", line = 12026)
	static final void method33422(@OriginalArg(0) Class681 arg0) {
		Class389.method28266();
		Class454.aBoolean774 = false;
	}

	@OriginalMember(owner = "client!yj", name = "ayz", descriptor = "(Lclient!yf;I)V", line = 14039)
	static final void method33421(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
