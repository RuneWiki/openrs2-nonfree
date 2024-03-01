package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amh")
public class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amh", name = "z", descriptor = "I")
	int anInt2651 = 462401809;

	@OriginalMember(owner = "client!amh", name = "j", descriptor = "I")
	public int anInt2648 = -1662794335;

	@OriginalMember(owner = "client!amh", name = "n", descriptor = "I")
	public int anInt2652 = -1183780352;

	@OriginalMember(owner = "client!amh", name = "e", descriptor = "I")
	public int anInt2653 = 0;

	@OriginalMember(owner = "client!amh", name = "r", descriptor = "I")
	public int anInt2654 = -1891111424;

	@OriginalMember(owner = "client!amh", name = "d", descriptor = "I")
	public int anInt2655 = 0;

	@OriginalMember(owner = "client!amh", name = "q", descriptor = "Z")
	boolean aBoolean467 = true;

	@OriginalMember(owner = "client!amh", name = "s", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!amh", name = "y", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!amh", name = "c", descriptor = "I")
	public int anInt2650;

	@OriginalMember(owner = "client!amh", name = "b", descriptor = "Lclient!wk;")
	Class553 aClass553_40;

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 23)
	Class3_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2649 = arg0 * 378268541;
		this.aString106 = arg1;
		this.aString105 = arg2;
		this.anInt2650 = arg3 * 210847103;
		this.anInt2651 = arg4 * -462401809;
		this.aBoolean467 = arg5;
		this.anInt2648 = arg6 * 1662794335;
		if (this.anInt2648 * -897670753 == 255) {
			this.anInt2648 = 0;
		}
		Class140.method23020(arg7);
		this.aClass553_40 = new Class553();
	}

	@OriginalMember(owner = "client!amh", name = "p", descriptor = "(IIB)Z", line = 37)
	boolean method18894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11652(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "s", descriptor = "(II)Z", line = 37)
	boolean method18898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11652(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "(II)Z", line = 37)
	boolean method18899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11652(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "y", descriptor = "(II[I)Z", line = 44)
	public boolean method18893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11654(arg0, arg1)) {
				local5.method11664(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "a", descriptor = "(II[II)Z", line = 44)
	public boolean method18903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11654(arg0, arg1)) {
				local5.method11664(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "g", descriptor = "(II[II)Z", line = 54)
	public boolean method18902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11652(arg0, arg1)) {
				local5.method11655(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "l", descriptor = "(III[IS)Z", line = 64)
	public boolean method18896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11653(arg0, arg1, arg2)) {
				local5.method11655(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "b", descriptor = "(III[I)Z", line = 64)
	public boolean method18901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class3_Sub31 local5 = (Class3_Sub31) this.aClass553_40.method32768(); local5 != null; local5 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local5.method11653(arg0, arg1, arg2)) {
				local5.method11655(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!amh", name = "z", descriptor = "()V", line = 74)
	void method18895() {
		this.anInt2652 = -1183780352;
		this.anInt2653 = 0;
		this.anInt2654 = -1891111424;
		this.anInt2655 = 0;
		for (@Pc(17) Class3_Sub31 local17 = (Class3_Sub31) this.aClass553_40.method32768(); local17 != null; local17 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local17.anInt1337 * -853122053 < this.anInt2652 * 1214831777) {
				this.anInt2652 = local17.anInt1337 * 1486602011;
			}
			if (local17.anInt1339 * 1434063343 > this.anInt2653 * 363486565) {
				this.anInt2653 = local17.anInt1339 * -986622269;
			}
			if (local17.anInt1332 * 840284925 < this.anInt2654 * 1120229487) {
				this.anInt2654 = local17.anInt1332 * -269983405;
			}
			if (local17.anInt1340 * -679396569 > this.anInt2655 * -1121810567) {
				this.anInt2655 = local17.anInt1340 * 123146143;
			}
		}
	}

	@OriginalMember(owner = "client!amh", name = "h", descriptor = "(S)V", line = 74)
	void method18897() {
		this.anInt2652 = -1183780352;
		this.anInt2653 = 0;
		this.anInt2654 = -1891111424;
		this.anInt2655 = 0;
		for (@Pc(17) Class3_Sub31 local17 = (Class3_Sub31) this.aClass553_40.method32768(); local17 != null; local17 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local17.anInt1337 * -853122053 < this.anInt2652 * 1214831777) {
				this.anInt2652 = local17.anInt1337 * 1486602011;
			}
			if (local17.anInt1339 * 1434063343 > this.anInt2653 * 363486565) {
				this.anInt2653 = local17.anInt1339 * -986622269;
			}
			if (local17.anInt1332 * 840284925 < this.anInt2654 * 1120229487) {
				this.anInt2654 = local17.anInt1332 * -269983405;
			}
			if (local17.anInt1340 * -679396569 > this.anInt2655 * -1121810567) {
				this.anInt2655 = local17.anInt1340 * 123146143;
			}
		}
	}

	@OriginalMember(owner = "client!amh", name = "c", descriptor = "()V", line = 74)
	void method18900() {
		this.anInt2652 = -1183780352;
		this.anInt2653 = 0;
		this.anInt2654 = -1891111424;
		this.anInt2655 = 0;
		for (@Pc(17) Class3_Sub31 local17 = (Class3_Sub31) this.aClass553_40.method32768(); local17 != null; local17 = (Class3_Sub31) this.aClass553_40.method32709()) {
			if (local17.anInt1337 * -853122053 < this.anInt2652 * 1214831777) {
				this.anInt2652 = local17.anInt1337 * 1486602011;
			}
			if (local17.anInt1339 * 1434063343 > this.anInt2653 * 363486565) {
				this.anInt2653 = local17.anInt1339 * -986622269;
			}
			if (local17.anInt1332 * 840284925 < this.anInt2654 * 1120229487) {
				this.anInt2654 = local17.anInt1332 * -269983405;
			}
			if (local17.anInt1340 * -679396569 > this.anInt2655 * -1121810567) {
				this.anInt2655 = local17.anInt1340 * 123146143;
			}
		}
	}

	@OriginalMember(owner = "client!amh", name = "j", descriptor = "(Lclient!ny;II)Lclient!amh;", line = 87)
	static Class3_Sub1_Sub4 method18904(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub41 local8 = new Class3_Sub41(arg0.method26713(arg1, arg2));
		@Pc(39) Class3_Sub1_Sub4 local39 = new Class3_Sub1_Sub4(arg2, local8.method20283(), local8.method20283(), local8.method20275(), local8.method20275(), local8.method20269() == 1, local8.method20269(), local8.method20269());
		@Pc(43) int local43 = local8.method20269();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			local39.aClass553_40.method32702(new Class3_Sub31(local8.method20269(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271()));
		}
		local39.method18897();
		return local39;
	}

	@OriginalMember(owner = "client!amh", name = "n", descriptor = "(Lclient!ny;II)Lclient!amh;", line = 87)
	static Class3_Sub1_Sub4 method18905(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub41 local8 = new Class3_Sub41(arg0.method26713(arg1, arg2));
		@Pc(39) Class3_Sub1_Sub4 local39 = new Class3_Sub1_Sub4(arg2, local8.method20283(), local8.method20283(), local8.method20275(), local8.method20275(), local8.method20269() == 1, local8.method20269(), local8.method20269());
		@Pc(43) int local43 = local8.method20269();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			local39.aClass553_40.method32702(new Class3_Sub31(local8.method20269(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271(), local8.method20271()));
		}
		local39.method18897();
		return local39;
	}

	@OriginalMember(owner = "client!amh", name = "ay", descriptor = "(IZB)V", line = 219)
	static void method18906(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(23, (long) arg0);
		local4.method19155();
		local4.anInt2693 = (arg1 ? 1 : 0) * 1666161167;
	}
}
