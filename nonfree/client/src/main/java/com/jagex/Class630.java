package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public class Class630 {

	@OriginalMember(owner = "client!wt", name = "on", descriptor = "I")
	public static int anInt5703;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
	final int anInt5700;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	final int anInt5701;

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "Z")
	boolean aBoolean850;

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "Lclient!wg;")
	final Class617 aClass617_2;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	final int anInt5702;

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
	final int anInt5698;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	final int anInt5699;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIZZILclient!wg;I)V", line = 12)
	Class630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class617 arg5, @OriginalArg(6) int arg6) {
		this.anInt5700 = arg0 * 676874359;
		this.anInt5701 = arg1 * -1740398321;
		this.aBoolean850 = arg2;
		this.aClass617_2 = arg5;
		this.anInt5702 = arg6 * 1633890245;
		if (arg2) {
			this.anInt5698 = arg4 * -509225121;
			this.anInt5699 = this.method32600(arg4) * -377406947;
		} else {
			this.anInt5698 = 509225121;
			this.anInt5699 = 377406947;
		}
	}

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "(I)I", line = 29)
	int method32581() {
		return this.anInt5700 * 1139544391;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "()I", line = 29)
	int method32582() {
		return this.anInt5700 * 1139544391;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)Z", line = 33)
	public boolean method32583() {
		return this.aBoolean850;
	}

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "()Z", line = 33)
	public boolean method32584() {
		return this.aBoolean850;
	}

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "()I", line = 37)
	public int method32585() {
		return this.anInt5699 * 843667509;
	}

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "(B)I", line = 37)
	public int method32586() {
		return this.anInt5699 * 843667509;
	}

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "(I)I", line = 41)
	public int method32587() {
		return this.anInt5698 * -646560609;
	}

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "()I", line = 41)
	public int method32588() {
		return this.anInt5698 * -646560609;
	}

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "()I", line = 41)
	public int method32589() {
		return this.anInt5698 * -646560609;
	}

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "(B)Z", line = 45)
	public boolean method32590() {
		return this.anInt5699 * 843667509 != -1;
	}

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "()Z", line = 45)
	public boolean method32591() {
		return this.anInt5699 * 843667509 != -1;
	}

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "(I)I", line = 49)
	public int method32592(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass617_2.method32376(arg0) + this.anInt5702 * -2116389107;
		return local10 > this.anInt5701 * 128134639 ? this.anInt5701 * 128134639 : local10;
	}

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "(II)I", line = 49)
	public int method32593(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass617_2.method32376(arg0) + this.anInt5702 * -2116389107;
		return local10 > this.anInt5701 * 128134639 ? this.anInt5701 * 128134639 : local10;
	}

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "(I)I", line = 49)
	public int method32594(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass617_2.method32376(arg0) + this.anInt5702 * -2116389107;
		return local10 > this.anInt5701 * 128134639 ? this.anInt5701 * 128134639 : local10;
	}

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "(I)I", line = 49)
	public int method32595(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass617_2.method32376(arg0) + this.anInt5702 * -2116389107;
		return local10 > this.anInt5701 * 128134639 ? this.anInt5701 * 128134639 : local10;
	}

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)I", line = 55)
	public int method32596(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32593(local3);
	}

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "(II)I", line = 55)
	public int method32597(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32593(local3);
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)I", line = 60)
	int method32598(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt5701 * 128134639) {
			arg0 = this.anInt5701 * 128134639;
		}
		return this.aClass617_2.method32377(arg0 - this.anInt5702 * -2116389107);
	}

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "(IB)I", line = 60)
	int method32599(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt5701 * 128134639) {
			arg0 = this.anInt5701 * 128134639;
		}
		return this.aClass617_2.method32377(arg0 - this.anInt5702 * -2116389107);
	}

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "(II)I", line = 65)
	int method32600(@OriginalArg(0) int arg0) {
		return this.method32599(arg0) * 10;
	}

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "(I)I", line = 65)
	int method32601(@OriginalArg(0) int arg0) {
		return this.method32599(arg0) * 10;
	}

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "(Lclient!pw;B)I", line = 79)
	public static int method32602(@OriginalArg(0) Class478 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method29730(Class231.anInt3762 * 149327611)) {
			local1++;
		}
		if (arg0.method29730(Class611.anInt5572 * -1795683815)) {
			local1++;
		}
		if (arg0.method29730(Class49.anInt178 * 1750510521)) {
			local1++;
		}
		if (arg0.method29730(Class529.anInt5171 * 1069313081)) {
			local1++;
		}
		if (arg0.method29730(Class245.anInt3798 * -1687969609)) {
			local1++;
		}
		if (arg0.method29730(Class611.anInt5573 * 140074605)) {
			local1++;
		}
		if (arg0.method29730(Class536.anInt5190 * 1714366393)) {
			local1++;
		}
		if (arg0.method29730(Class244.anInt3797 * 2006108777)) {
			local1++;
		}
		if (arg0.method29730(Class606.anInt5564 * 2116470397)) {
			local1++;
		}
		if (arg0.method29730(Class415.anInt4719 * 1474934323)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wt", name = "at", descriptor = "(Ljava/lang/String;I)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 504)
	public static TwitchWebcamDevice method32603(@OriginalArg(0) String arg0) {
		if (Class574.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < Class574.aTwitchWebcamDeviceArray1.length; local5++) {
			if (Class574.aTwitchWebcamDeviceArray1[local5].p.equals(arg0)) {
				return Class574.aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wt", name = "jk", descriptor = "(Lclient!yf;I)V", line = 6180)
	static final void method32604(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class522.method30623(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "ku", descriptor = "(Lclient!yf;I)V", line = 6503)
	static final void method32605(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class655.method33010(local11, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "axl", descriptor = "(Lclient!yf;S)V", line = 13533)
	static final void method32606(@OriginalArg(0) Class665 arg0) {
		Class124.method11103(arg0.aClass104_Sub1_Sub5_Sub1_1, arg0);
	}
}
