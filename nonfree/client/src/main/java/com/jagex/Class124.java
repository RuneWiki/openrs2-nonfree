package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public class Class124 implements Interface19, Interface17, Interface72 {

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "[Lclient!wm;")
	final Class623[] aClass623Array1;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "Lclient!vx;")
	public final Class608 aClass608_1;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!adn;")
	final Class80_Sub1_Sub1 aClass80_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "Lclient!ans;")
	final Class35_Sub11 aClass35_Sub11_2;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!adn;Lclient!ans;I)V", line = 21)
	public Class124(@OriginalArg(0) Class80_Sub1_Sub1 arg0, @OriginalArg(1) Class35_Sub11 arg1, @OriginalArg(2) int arg2) {
		this.aClass623Array1 = new Class623[arg2];
		this.aClass608_1 = new Class608();
		this.aClass80_Sub1_Sub1_1 = arg0;
		this.aClass35_Sub11_2 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "(II)I", line = 29)
	public int method11089(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32446(client.aBoolean613 ? Class676.aClass676_2 : Class676.aClass676_1);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)I", line = 29)
	public int method11090(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32446(client.aBoolean613 ? Class676.aClass676_2 : Class676.aClass676_1);
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I", line = 33)
	public int method11091(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32460();
	}

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "(I)I", line = 33)
	public int method11092(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32460();
	}

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "(I)I", line = 33)
	public int method11093(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32460();
	}

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "(IB)I", line = 37)
	@Override
	public int method11087(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32456(client.aBoolean613 ? Class676.aClass676_2 : Class676.aClass676_1);
	}

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "(I)I", line = 37)
	@Override
	public int method11088(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32456(client.aBoolean613 ? Class676.aClass676_2 : Class676.aClass676_1);
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)I", line = 37)
	@Override
	public int method11086(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32456(client.aBoolean613 ? Class676.aClass676_2 : Class676.aClass676_1);
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "(II)I", line = 41)
	public int method11094(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32439();
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)I", line = 41)
	public int method11095(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32439();
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)I", line = 41)
	public int method11096(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32439();
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "(I)I", line = 41)
	public int method11097(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32439();
	}

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "(II)I", line = 45)
	public int method11098(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32452();
	}

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "(I)I", line = 45)
	public int method11099(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32452();
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)I", line = 45)
	public int method11100(@OriginalArg(0) int arg0) {
		return this.aClass623Array1[arg0].method32452();
	}

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "(Lclient!pd;II)Lclient!ci;", line = 49)
	@Override
	public Class75 method27607(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		return Class127.aClass127_63 == arg0 ? (Class75) this.aClass80_Sub1_Sub1_1.method18319(arg1) : null;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(Lclient!pd;I)Lclient!ci;", line = 49)
	@Override
	public Class75 method27608(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		return Class127.aClass127_63 == arg0 ? (Class75) this.aClass80_Sub1_Sub1_1.method18319(arg1) : null;
	}

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "(II)Lclient!ji;", line = 54)
	@Override
	public Class343 method27606(@OriginalArg(0) int arg0) {
		@Pc(6) Class343 local6 = (Class343) this.aClass35_Sub11_2.method18319(arg0);
		return local6.aClass75_1.aClass127_3 == Class127.aClass127_63 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lclient!ji;", line = 54)
	@Override
	public Class343 method27609(@OriginalArg(0) int arg0) {
		@Pc(6) Class343 local6 = (Class343) this.aClass35_Sub11_2.method18319(arg0);
		return local6.aClass75_1.aClass127_3 == Class127.aClass127_63 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "(I)Lclient!ji;", line = 54)
	@Override
	public Class343 method27610(@OriginalArg(0) int arg0) {
		@Pc(6) Class343 local6 = (Class343) this.aClass35_Sub11_2.method18319(arg0);
		return local6.aClass75_1.aClass127_3 == Class127.aClass127_63 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "(I)Lclient!ji;", line = 54)
	@Override
	public Class343 method27611(@OriginalArg(0) int arg0) {
		@Pc(6) Class343 local6 = (Class343) this.aClass35_Sub11_2.method18319(arg0);
		return local6.aClass75_1.aClass127_3 == Class127.aClass127_63 ? local6 : null;
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "(Lclient!ci;B)I", line = 60)
	@Override
	public int method35934(@OriginalArg(0) Class75 arg0) {
		return this.aClass608_1.method35934(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ci;)I", line = 60)
	@Override
	public int method35937(@OriginalArg(0) Class75 arg0) {
		return this.aClass608_1.method35934(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "(Lclient!ci;)I", line = 60)
	@Override
	public int method35936(@OriginalArg(0) Class75 arg0) {
		return this.aClass608_1.method35934(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "(Lclient!ji;I)I", line = 64)
	@Override
	public int method35935(@OriginalArg(0) Class343 arg0) {
		return this.aClass608_1.method35935(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(Lclient!ji;)I", line = 64)
	@Override
	public int method35938(@OriginalArg(0) Class343 arg0) {
		return this.aClass608_1.method35935(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "aj", descriptor = "(Lclient!ji;)I", line = 64)
	@Override
	public int method35939(@OriginalArg(0) Class343 arg0) {
		return this.aClass608_1.method35935(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "ai", descriptor = "(Lclient!ji;)I", line = 64)
	@Override
	public int method35940(@OriginalArg(0) Class343 arg0) {
		return this.aClass608_1.method35935(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "ag", descriptor = "(Lclient!ji;)I", line = 64)
	@Override
	public int method35941(@OriginalArg(0) Class343 arg0) {
		return this.aClass608_1.method35935(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "hg", descriptor = "(Lclient!agh;B)V", line = 3875)
	static final void method11101(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class151 local2 = arg0.aClass151_3;
		if (arg0.anInt2889 * -1259938159 == client.anInt3414 || !local2.method23396() || local2.method23469(1)) {
			@Pc(27) int local27 = arg0.anInt2889 * -1259938159 - arg0.anInt2888 * -1626386689;
			@Pc(34) int local34 = client.anInt3414 - arg0.anInt2888 * -1626386689;
			@Pc(45) int local45 = arg0.anInt2879 * 1791130112 + arg0.method21095() * 256;
			@Pc(56) int local56 = arg0.anInt2881 * 660825600 + arg0.method21095() * 256;
			@Pc(67) int local67 = arg0.anInt2884 * 1449754112 + arg0.method21095() * 256;
			@Pc(78) int local78 = arg0.anInt2899 * -199475712 + arg0.method21095() * 256;
			@Pc(90) int local90 = ((local27 - local34) * local45 + local67 * local34) / local27;
			@Pc(102) int local102 = (local56 * (local27 - local34) + local78 * local34) / local27;
			@Pc(111) int local111 = Class277.method26658(local90, local102, arg0.anInt2886 * -2033865703);
			@Pc(120) int local120 = Class277.method26658(local67, local78, arg0.anInt2887 * -1853533151);
			@Pc(132) int local132 = (local34 * local120 + (local27 - local34) * local111) / local27;
			arg0.method24106((float) local90, (float) local132, (float) local102);
		}
		arg0.anInt2882 = 0;
		arg0.method21070(arg0.anInt2890 * -565919971, false);
	}

	@OriginalMember(owner = "client!ai", name = "aqb", descriptor = "(Lclient!yf;I)V", line = 12347)
	static final void method11102(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912();
	}

	@OriginalMember(owner = "client!ai", name = "axb", descriptor = "(Lclient!alc;Lclient!yf;B)V", line = 13484)
	static final void method11103(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (arg0.aClass224Array21 != null) {
			for (@Pc(14) int local14 = 0; local14 < arg0.aClass224Array21.length; local14++) {
				@Pc(24) Class224 local24 = arg0.aClass224Array21[local14];
				if (local24.aBoolean644) {
					@Pc(38) int local38;
					@Pc(44) int local44;
					if (local24.anInt3748 < local24.anInt3745) {
						local38 = local24.anInt3748 - local24.anInt3744;
						local44 = local24.anInt3745 + local24.anInt3744;
					} else {
						local38 = local24.anInt3745 - local24.anInt3744;
						local44 = local24.anInt3748 + local24.anInt3744;
					}
					@Pc(68) int local68;
					@Pc(74) int local74;
					if (local24.anInt3747 < local24.anInt3746) {
						local68 = local24.anInt3747 - local24.anInt3744;
						local74 = local24.anInt3746 + local24.anInt3744;
					} else {
						local68 = local24.anInt3746 - local24.anInt3744;
						local74 = local24.anInt3747 + local24.anInt3744;
					}
					if (!local1 || local38 < local3) {
						local3 = local38;
					}
					if (!local1 || local68 < local5) {
						local5 = local68;
					}
					if (!local1 || local44 > local7) {
						local7 = local44;
					}
					if (!local1 || local74 > local9) {
						local9 = local74;
					}
					local1 = true;
				}
			}
		}
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local1 ? 1 : 0;
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local3;
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local5;
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local7;
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local9;
	}
}
