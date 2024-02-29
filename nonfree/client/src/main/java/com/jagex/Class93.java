package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public class Class93 implements Interface18 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	static int anInt731;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!aao;")
	public final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!adw;)V", line = 13)
	public Class93(@OriginalArg(0) Class80_Sub1 arg0) {
		this(arg0, new Class9(arg0));
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!adw;Lclient!aah;)V", line = 17)
	Class93(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class9 arg1) {
		this(arg0.aClass127_6, arg1);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!pd;Lclient!aah;)V", line = 20)
	public Class93(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class9 arg1) {
		this.anInterface3_2 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ci;)I", line = 25)
	@Override
	public int method35937(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method131(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "m", descriptor = "(Lclient!ci;)I", line = 25)
	@Override
	public int method35936(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method131(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "q", descriptor = "(Lclient!ci;B)I", line = 25)
	@Override
	public int method35934(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method131(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "p", descriptor = "(Lclient!ci;II)V", line = 29)
	@Override
	public void method35943(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_2.method127(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(Lclient!ci;I)V", line = 29)
	@Override
	public void method35951(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_2.method127(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "t", descriptor = "(Lclient!ci;I)V", line = 29)
	@Override
	public void method35947(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_2.method127(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "z", descriptor = "(Lclient!ci;)J", line = 33)
	@Override
	public long method35955(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(Lclient!ci;B)J", line = 33)
	@Override
	public long method35950(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "s", descriptor = "(Lclient!ci;)J", line = 33)
	@Override
	public long method35952(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "r", descriptor = "(Lclient!ci;)J", line = 33)
	@Override
	public long method35956(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(Lclient!ci;)J", line = 33)
	@Override
	public long method35954(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "v", descriptor = "(Lclient!ci;J)V", line = 37)
	@Override
	public void method35945(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "i", descriptor = "(Lclient!ci;J)V", line = 37)
	@Override
	public void method35942(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "j", descriptor = "(Lclient!ci;J)V", line = 37)
	@Override
	public void method35944(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "k", descriptor = "(Lclient!ci;J)V", line = 37)
	@Override
	public void method35953(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "u", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 41)
	@Override
	public Object method35957(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method144(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "l", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 41)
	@Override
	public Object method35949(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method144(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 41)
	@Override
	public Object method35958(@OriginalArg(0) Class75 arg0) {
		return this.anInterface3_2.method144(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!co", name = "y", descriptor = "(Lclient!ci;Ljava/lang/Object;B)V", line = 45)
	@Override
	public void method35946(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method128(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(Lclient!ci;Ljava/lang/Object;)V", line = 45)
	@Override
	public void method35959(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method128(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!co", name = "ag", descriptor = "(Lclient!ji;)I", line = 49)
	@Override
	public int method35941(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!co", name = "x", descriptor = "(Lclient!ji;I)I", line = 49)
	@Override
	public int method35935(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!co", name = "h", descriptor = "(Lclient!ji;)I", line = 49)
	@Override
	public int method35938(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!co", name = "aj", descriptor = "(Lclient!ji;)I", line = 49)
	@Override
	public int method35939(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!co", name = "ai", descriptor = "(Lclient!ji;)I", line = 49)
	@Override
	public int method35940(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!co", name = "w", descriptor = "(Lclient!ji;IB)V", line = 53)
	@Override
	public void method35948(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method35943(arg0.aClass75_1, arg0.method27803(this.method35934(arg0.aClass75_1), arg1));
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Lclient!ji;I)V", line = 53)
	@Override
	public void method35961(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method35943(arg0.aClass75_1, arg0.method27803(this.method35934(arg0.aClass75_1), arg1));
	}

	@OriginalMember(owner = "client!co", name = "o", descriptor = "(Lclient!ji;I)V", line = 53)
	@Override
	public void method35960(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method35943(arg0.aClass75_1, arg0.method27803(this.method35934(arg0.aClass75_1), arg1));
	}

	@OriginalMember(owner = "client!co", name = "hk", descriptor = "(Lclient!agh;I)I", line = 4053)
	static final int method6424(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt2897 * -650254265 == 0) {
			return 0;
		}
		@Pc(70) int local70;
		@Pc(62) Class447 local62;
		if (arg0.anInt2880 * 1409535459 != -1) {
			@Pc(14) Class104_Sub1_Sub1_Sub1 local14 = null;
			if (arg0.anInt2880 * 1409535459 < 32768) {
				@Pc(29) Class77_Sub6 local29 = (Class77_Sub6) client.aClass12_22.method173((long) (arg0.anInt2880 * 1409535459));
				if (local29 != null) {
					local14 = (Class104_Sub1_Sub1_Sub1) local29.anObject5;
				}
			} else if (arg0.anInt2880 * 1409535459 >= 32768) {
				local14 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt2880 * 1409535459 - 32768];
			}
			if (local14 != null) {
				local62 = Class447.method29160(arg0.method24085().aClass447_61, local14.method24085().aClass447_61);
				@Pc(66) int local66 = (int) local62.aFloat277;
				local70 = (int) local62.aFloat278;
				if (local66 != 0 || local70 != 0) {
					arg0.method21069((int) (Math.atan2((double) local66, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class104_Sub1_Sub1_Sub1_Sub2) {
			@Pc(95) Class104_Sub1_Sub1_Sub1_Sub2 local95 = (Class104_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local95.anInt2910 * -2025203045 != -1 && (local95.anInt2900 * -1763707177 == 0 || local95.anInt2882 * 1235744983 > 0)) {
				local95.method21069(local95.anInt2910 * -2025203045);
				local95.anInt2910 = 1021477997;
			}
		} else if (arg0 instanceof Class104_Sub1_Sub1_Sub1_Sub1) {
			@Pc(129) Class104_Sub1_Sub1_Sub1_Sub1 local129 = (Class104_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local129.anInt2755 * -1294025797 != -1 && (local129.anInt2900 * -1763707177 == 0 || local129.anInt2882 * 1235744983 > 0)) {
				local62 = local129.method24085().aClass447_61;
				@Pc(153) Class595 local153 = client.aClass517_1.method30409();
				local70 = (int) local62.aFloat277 - (local129.anInt2755 * -558122240 - local153.anInt5504 * -1221009664 - local153.anInt5504 * -1221009664);
				@Pc(191) int local191 = (int) local62.aFloat278 - (local129.anInt2756 * -1915040000 - local153.anInt5506 * 2077618944 - local153.anInt5506 * 2077618944);
				if (local70 != 0 || local191 != 0) {
					local129.method21069((int) (Math.atan2((double) local70, (double) local191) * 2607.5945876176133D) & 0x3FFF);
				}
				local129.anInt2755 = 433401485;
			}
		}
		return arg0.method21072();
	}

	@OriginalMember(owner = "client!co", name = "dd", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5199)
	static final void method6425(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= -1204971666;
		arg0.aBoolean675 = true;
		arg0.anInt3908 = Math.max(Math.min(arg2.anIntArray536[arg2.anInt5784 * 2088438307], 2816), 0) * 827777951;
		arg0.anInt3905 = Math.max(Math.min(arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1], 2816), 0) * -1717407349;
		arg0.anInt3906 = Math.max(Math.min(arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 2], 2816), 0) * 1995007491;
		@Pc(71) int local71 = Math.max(Math.min(arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 3], 255), 0);
		@Pc(85) int local85 = Math.max(Math.min(arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 4], 255), 0);
		@Pc(99) int local99 = Math.max(Math.min(arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 5], 255), 0);
		arg0.anInt3899 = (local71 << 16 | local85 << 8 | local99) * -1401656177;
		arg0.anInt3945 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 6] * -1918420773;
		arg0.anInt3923 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 7] * -671112543;
		arg0.anInt3938 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 8] * -1970864823;
		arg0.anInt3850 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 9] * 1621962113;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!co", name = "adm", descriptor = "(Lclient!yf;I)V", line = 9787)
	static final void method6426(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local13 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13.length();
		}
	}
}
