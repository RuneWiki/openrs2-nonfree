package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amx")
public class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amx", name = "s", descriptor = "Lclient!ny;")
	static Class359 aClass359_30;

	@OriginalMember(owner = "client!amx", name = "b", descriptor = "[[B")
	byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!amx", name = "c", descriptor = "[Lclient!dl;")
	Class129[] aClass129Array1;

	@OriginalMember(owner = "client!amx", name = "y", descriptor = "I")
	int anInt2702;

	@OriginalMember(owner = "client!amx", name = "s", descriptor = "(Lclient!ny;Lclient!ny;I)V", line = 16)
	public static void method19448(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1) {
		aClass359_30 = arg0;
		Class238.aClass359_49 = arg1;
	}

	@OriginalMember(owner = "client!amx", name = "x", descriptor = "(Lclient!ny;Lclient!ny;I)V", line = 16)
	public static void method19450(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1) {
		aClass359_30 = arg0;
		Class238.aClass359_49 = arg1;
	}

	@OriginalMember(owner = "client!amx", name = "u", descriptor = "(Lclient!ny;Lclient!ny;I)V", line = 16)
	public static void method19452(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1) {
		aClass359_30 = arg0;
		Class238.aClass359_49 = arg1;
	}

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(I)V", line = 20)
	public Class3_Sub1_Sub17(@OriginalArg(0) int arg0) {
		this.anInt2702 = arg0 * 598832267;
	}

	@OriginalMember(owner = "client!amx", name = "y", descriptor = "()Z", line = 25)
	public boolean method19445() {
		if (this.aClass129Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray11 == null) {
			@Pc(12) Class359 local12 = aClass359_30;
			synchronized (aClass359_30) {
				if (!aClass359_30.method26675(this.anInt2702 * -1671671005)) {
					return false;
				}
				@Pc(33) int[] local33 = aClass359_30.method26680(this.anInt2702 * -1671671005);
				this.aByteArrayArray11 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray11[local40] = aClass359_30.method26713(this.anInt2702 * -1671671005, local33[local40]);
				}
			}
		}
		@Pc(70) boolean local70 = true;
		@Pc(94) int local94;
		for (@Pc(72) int local72 = 0; local72 < this.aByteArrayArray11.length; local72++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local72];
			@Pc(87) Class3_Sub41 local87 = new Class3_Sub41(local82);
			local87.anInt2803 = -918980331;
			local94 = local87.method20271();
			@Pc(97) Class359 local97 = Class238.aClass359_49;
			synchronized (Class238.aClass359_49) {
				local70 &= Class238.aClass359_49.method26674(local94);
			}
		}
		if (!local70) {
			return false;
		}
		@Pc(123) Class553 local123 = new Class553();
		@Pc(126) Class359 local126 = aClass359_30;
		@Pc(147) int[] local147;
		synchronized (aClass359_30) {
			local94 = aClass359_30.method26682(this.anInt2702 * -1671671005);
			this.aClass129Array1 = new Class129[local94];
			local147 = aClass359_30.method26680(this.anInt2702 * -1671671005);
		}
		for (@Pc(157) int local157 = 0; local157 < local147.length; local157++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray11[local157];
			@Pc(171) Class3_Sub41 local171 = new Class3_Sub41(local166);
			local171.anInt2803 = -918980331;
			@Pc(178) int local178 = local171.method20271();
			@Pc(180) Class3_Sub14 local180 = null;
			for (@Pc(185) Class3_Sub14 local185 = (Class3_Sub14) local123.method32768(); local185 != null; local185 = (Class3_Sub14) local123.method32709()) {
				if (local185.anInt1238 * -2137369915 == local178) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(209) Class359 local209 = Class238.aClass359_49;
				synchronized (Class238.aClass359_49) {
					local180 = new Class3_Sub14(local178, Class238.aClass359_49.method26705(local178));
				}
				local123.method32702(local180);
			}
			this.aClass129Array1[local147[local157]] = new Class129(local166, local180);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!amx", name = "a", descriptor = "(I)Z", line = 25)
	public boolean method19451() {
		if (this.aClass129Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray11 == null) {
			@Pc(12) Class359 local12 = aClass359_30;
			synchronized (aClass359_30) {
				if (!aClass359_30.method26675(this.anInt2702 * -1671671005)) {
					return false;
				}
				@Pc(33) int[] local33 = aClass359_30.method26680(this.anInt2702 * -1671671005);
				this.aByteArrayArray11 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray11[local40] = aClass359_30.method26713(this.anInt2702 * -1671671005, local33[local40]);
				}
			}
		}
		@Pc(70) boolean local70 = true;
		@Pc(94) int local94;
		for (@Pc(72) int local72 = 0; local72 < this.aByteArrayArray11.length; local72++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local72];
			@Pc(87) Class3_Sub41 local87 = new Class3_Sub41(local82);
			local87.anInt2803 = -918980331;
			local94 = local87.method20271();
			@Pc(97) Class359 local97 = Class238.aClass359_49;
			synchronized (Class238.aClass359_49) {
				local70 &= Class238.aClass359_49.method26674(local94);
			}
		}
		if (!local70) {
			return false;
		}
		@Pc(123) Class553 local123 = new Class553();
		@Pc(126) Class359 local126 = aClass359_30;
		@Pc(147) int[] local147;
		synchronized (aClass359_30) {
			local94 = aClass359_30.method26682(this.anInt2702 * -1671671005);
			this.aClass129Array1 = new Class129[local94];
			local147 = aClass359_30.method26680(this.anInt2702 * -1671671005);
		}
		for (@Pc(157) int local157 = 0; local157 < local147.length; local157++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray11[local157];
			@Pc(171) Class3_Sub41 local171 = new Class3_Sub41(local166);
			local171.anInt2803 = -918980331;
			@Pc(178) int local178 = local171.method20271();
			@Pc(180) Class3_Sub14 local180 = null;
			for (@Pc(185) Class3_Sub14 local185 = (Class3_Sub14) local123.method32768(); local185 != null; local185 = (Class3_Sub14) local123.method32709()) {
				if (local185.anInt1238 * -2137369915 == local178) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(209) Class359 local209 = Class238.aClass359_49;
				synchronized (Class238.aClass359_49) {
					local180 = new Class3_Sub14(local178, Class238.aClass359_49.method26705(local178));
				}
				local123.method32702(local180);
			}
			this.aClass129Array1[local147[local157]] = new Class129(local166, local180);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!amx", name = "b", descriptor = "()Z", line = 25)
	public boolean method19453() {
		if (this.aClass129Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray11 == null) {
			@Pc(12) Class359 local12 = aClass359_30;
			synchronized (aClass359_30) {
				if (!aClass359_30.method26675(this.anInt2702 * -1671671005)) {
					return false;
				}
				@Pc(33) int[] local33 = aClass359_30.method26680(this.anInt2702 * -1671671005);
				this.aByteArrayArray11 = new byte[local33.length][];
				for (@Pc(40) int local40 = 0; local40 < local33.length; local40++) {
					this.aByteArrayArray11[local40] = aClass359_30.method26713(this.anInt2702 * -1671671005, local33[local40]);
				}
			}
		}
		@Pc(70) boolean local70 = true;
		@Pc(94) int local94;
		for (@Pc(72) int local72 = 0; local72 < this.aByteArrayArray11.length; local72++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray11[local72];
			@Pc(87) Class3_Sub41 local87 = new Class3_Sub41(local82);
			local87.anInt2803 = -918980331;
			local94 = local87.method20271();
			@Pc(97) Class359 local97 = Class238.aClass359_49;
			synchronized (Class238.aClass359_49) {
				local70 &= Class238.aClass359_49.method26674(local94);
			}
		}
		if (!local70) {
			return false;
		}
		@Pc(123) Class553 local123 = new Class553();
		@Pc(126) Class359 local126 = aClass359_30;
		@Pc(147) int[] local147;
		synchronized (aClass359_30) {
			local94 = aClass359_30.method26682(this.anInt2702 * -1671671005);
			this.aClass129Array1 = new Class129[local94];
			local147 = aClass359_30.method26680(this.anInt2702 * -1671671005);
		}
		for (@Pc(157) int local157 = 0; local157 < local147.length; local157++) {
			@Pc(166) byte[] local166 = this.aByteArrayArray11[local157];
			@Pc(171) Class3_Sub41 local171 = new Class3_Sub41(local166);
			local171.anInt2803 = -918980331;
			@Pc(178) int local178 = local171.method20271();
			@Pc(180) Class3_Sub14 local180 = null;
			for (@Pc(185) Class3_Sub14 local185 = (Class3_Sub14) local123.method32768(); local185 != null; local185 = (Class3_Sub14) local123.method32709()) {
				if (local185.anInt1238 * -2137369915 == local178) {
					local180 = local185;
					break;
				}
			}
			if (local180 == null) {
				@Pc(209) Class359 local209 = Class238.aClass359_49;
				synchronized (Class238.aClass359_49) {
					local180 = new Class3_Sub14(local178, Class238.aClass359_49.method26705(local178));
				}
				local123.method32702(local180);
			}
			this.aClass129Array1[local147[local157]] = new Class129(local166, local180);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!amx", name = "g", descriptor = "(IB)Z", line = 77)
	public boolean method19447(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean615;
	}

	@OriginalMember(owner = "client!amx", name = "c", descriptor = "(I)Z", line = 77)
	public boolean method19454(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean615;
	}

	@OriginalMember(owner = "client!amx", name = "z", descriptor = "(I)Z", line = 77)
	public boolean method19455(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean615;
	}

	@OriginalMember(owner = "client!amx", name = "j", descriptor = "(I)Z", line = 81)
	public boolean method19446(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean616;
	}

	@OriginalMember(owner = "client!amx", name = "l", descriptor = "(IB)Z", line = 81)
	public boolean method19456(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean616;
	}

	@OriginalMember(owner = "client!amx", name = "h", descriptor = "(II)Z", line = 85)
	public boolean method19449(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean614;
	}

	@OriginalMember(owner = "client!amx", name = "n", descriptor = "(I)Z", line = 85)
	public boolean method19457(@OriginalArg(0) int arg0) {
		return this.aClass129Array1[arg0].aBoolean614;
	}

	@OriginalMember(owner = "client!amx", name = "kn", descriptor = "(IIIIIIIIB)V", line = 9703)
	static final void method19458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Class33.method7569(arg0, null)) {
			Class624.method33782(Class178.aClass186Array1[arg0].method23919(), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0);
		} else if (arg7 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 112; local14++) {
				client.aBooleanArray19[local14] = true;
			}
		} else {
			client.aBooleanArray19[arg7] = true;
		}
	}
}
