package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vx")
public final class Class608 implements Interface18 {

	@OriginalMember(owner = "client!vx", name = "c", descriptor = "J")
	static final long aLong293 = 4611686018427387904L;

	@OriginalMember(owner = "client!vx", name = "v", descriptor = "J")
	static final long aLong294 = 1L;

	@OriginalMember(owner = "client!vx", name = "l", descriptor = "J")
	static final long aLong295 = 500L;

	@OriginalMember(owner = "client!vx", name = "p", descriptor = "J")
	static final long aLong296 = 4611686018427387903L;

	@OriginalMember(owner = "client!vx", name = "t", descriptor = "Lclient!aak;")
	Class12 aClass12_36 = new Class12(128);

	@OriginalMember(owner = "client!vx", name = "y", descriptor = "[I")
	int[] anIntArray516 = new int[Class562.aClass80_Sub1_Sub1_2.method18318()];

	@OriginalMember(owner = "client!vx", name = "w", descriptor = "[I")
	int[] anIntArray515 = new int[Class562.aClass80_Sub1_Sub1_2.method18318()];

	@OriginalMember(owner = "client!vx", name = "n", descriptor = "(ZI)I", line = 29)
	public int method32131(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class280.method26667();
		for (@Pc(15) Class77_Sub31 local15 = (Class77_Sub31) (arg0 ? this.aClass12_36.method190() : this.aClass12_36.method192()); local15 != null; local15 = (Class77_Sub31) this.aClass12_36.method192()) {
			if ((local15.aLong90 * -4291396730769792553L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong90 * -4291396730769792553L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong229 * 8258869577519436579L);
					this.anIntArray515[local42] = this.anIntArray516[local42];
					local15.method24063();
					return local42;
				}
				local15.method24063();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vx", name = "au", descriptor = "(Z)I", line = 29)
	public int method32132(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class280.method26667();
		for (@Pc(15) Class77_Sub31 local15 = (Class77_Sub31) (arg0 ? this.aClass12_36.method190() : this.aClass12_36.method192()); local15 != null; local15 = (Class77_Sub31) this.aClass12_36.method192()) {
			if ((local15.aLong90 * -4291396730769792553L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong90 * -4291396730769792553L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong229 * 8258869577519436579L);
					this.anIntArray515[local42] = this.anIntArray516[local42];
					local15.method24063();
					return local42;
				}
				local15.method24063();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vx", name = "ax", descriptor = "(Z)I", line = 29)
	public int method32133(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class280.method26667();
		for (@Pc(15) Class77_Sub31 local15 = (Class77_Sub31) (arg0 ? this.aClass12_36.method190() : this.aClass12_36.method192()); local15 != null; local15 = (Class77_Sub31) this.aClass12_36.method192()) {
			if ((local15.aLong90 * -4291396730769792553L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong90 * -4291396730769792553L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong229 * 8258869577519436579L);
					this.anIntArray515[local42] = this.anIntArray516[local42];
					local15.method24063();
					return local42;
				}
				local15.method24063();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vx", name = "al", descriptor = "(I)V", line = 45)
	public void method32134() {
		for (@Pc(1) int local1 = 0; local1 < Class562.aClass80_Sub1_Sub1_2.method18318(); local1++) {
			@Pc(12) Class75_Sub2 local12 = (Class75_Sub2) Class562.aClass80_Sub1_Sub1_2.method18319(local1);
			if (local12 != null) {
				this.anIntArray516[local1] = 0;
				this.anIntArray515[local1] = 0;
			}
		}
		this.aClass12_36 = new Class12(128);
	}

	@OriginalMember(owner = "client!vx", name = "a", descriptor = "(Lclient!ci;)I", line = 56)
	@Override
	public int method35937(@OriginalArg(0) Class75 arg0) {
		return this.anIntArray515[arg0.anInt223 * -1270946121];
	}

	@OriginalMember(owner = "client!vx", name = "m", descriptor = "(Lclient!ci;)I", line = 56)
	@Override
	public int method35936(@OriginalArg(0) Class75 arg0) {
		return this.anIntArray515[arg0.anInt223 * -1270946121];
	}

	@OriginalMember(owner = "client!vx", name = "q", descriptor = "(Lclient!ci;B)I", line = 56)
	@Override
	public int method35934(@OriginalArg(0) Class75 arg0) {
		return this.anIntArray515[arg0.anInt223 * -1270946121];
	}

	@OriginalMember(owner = "client!vx", name = "p", descriptor = "(Lclient!ci;II)V", line = 60)
	@Override
	public void method35943(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg0.anInt223 * -1270946121] = arg1;
		@Pc(17) Class77_Sub31 local17 = (Class77_Sub31) this.aClass12_36.method173((long) (arg0.anInt223 * -1270946121));
		if (local17 == null) {
			local17 = new Class77_Sub31(Class280.method26667() + 500L);
			this.aClass12_36.method184(local17, (long) (arg0.anInt223 * -1270946121));
		} else {
			local17.aLong90 = (Class280.method26667() + 500L) * 1934962372971061735L;
		}
	}

	@OriginalMember(owner = "client!vx", name = "d", descriptor = "(Lclient!ci;I)V", line = 60)
	@Override
	public void method35951(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg0.anInt223 * -1270946121] = arg1;
		@Pc(17) Class77_Sub31 local17 = (Class77_Sub31) this.aClass12_36.method173((long) (arg0.anInt223 * -1270946121));
		if (local17 == null) {
			local17 = new Class77_Sub31(Class280.method26667() + 500L);
			this.aClass12_36.method184(local17, (long) (arg0.anInt223 * -1270946121));
		} else {
			local17.aLong90 = (Class280.method26667() + 500L) * 1934962372971061735L;
		}
	}

	@OriginalMember(owner = "client!vx", name = "t", descriptor = "(Lclient!ci;I)V", line = 60)
	@Override
	public void method35947(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg0.anInt223 * -1270946121] = arg1;
		@Pc(17) Class77_Sub31 local17 = (Class77_Sub31) this.aClass12_36.method173((long) (arg0.anInt223 * -1270946121));
		if (local17 == null) {
			local17 = new Class77_Sub31(Class280.method26667() + 500L);
			this.aClass12_36.method184(local17, (long) (arg0.anInt223 * -1270946121));
		} else {
			local17.aLong90 = (Class280.method26667() + 500L) * 1934962372971061735L;
		}
	}

	@OriginalMember(owner = "client!vx", name = "ao", descriptor = "(Lclient!ci;II)V", line = 70)
	public void method32135(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray516[arg0.anInt223 * -1270946121] = arg1;
		@Pc(17) Class77_Sub31 local17 = (Class77_Sub31) this.aClass12_36.method173((long) (arg0.anInt223 * -1270946121));
		if (local17 == null) {
			local17 = new Class77_Sub31(4611686018427387905L);
			this.aClass12_36.method184(local17, (long) (arg0.anInt223 * -1270946121));
		} else if (local17.aLong90 * -4291396730769792553L != 4611686018427387905L) {
			local17.aLong90 = (Class280.method26667() + 500L | 0x4000000000000000L) * 1934962372971061735L;
		}
	}

	@OriginalMember(owner = "client!vx", name = "x", descriptor = "(Lclient!ji;I)I", line = 82)
	@Override
	public int method35935(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121]);
	}

	@OriginalMember(owner = "client!vx", name = "h", descriptor = "(Lclient!ji;)I", line = 82)
	@Override
	public int method35938(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121]);
	}

	@OriginalMember(owner = "client!vx", name = "aj", descriptor = "(Lclient!ji;)I", line = 82)
	@Override
	public int method35939(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121]);
	}

	@OriginalMember(owner = "client!vx", name = "ai", descriptor = "(Lclient!ji;)I", line = 82)
	@Override
	public int method35940(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121]);
	}

	@OriginalMember(owner = "client!vx", name = "ag", descriptor = "(Lclient!ji;)I", line = 82)
	@Override
	public int method35941(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121]);
	}

	@OriginalMember(owner = "client!vx", name = "b", descriptor = "(Lclient!ji;I)V", line = 86)
	@Override
	public void method35961(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(12) int local12 = arg0.method27803(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121], arg1);
		this.method35943(arg0.aClass75_1, local12);
	}

	@OriginalMember(owner = "client!vx", name = "w", descriptor = "(Lclient!ji;IB)V", line = 86)
	@Override
	public void method35948(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(12) int local12 = arg0.method27803(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121], arg1);
		this.method35943(arg0.aClass75_1, local12);
	}

	@OriginalMember(owner = "client!vx", name = "o", descriptor = "(Lclient!ji;I)V", line = 86)
	@Override
	public void method35960(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(12) int local12 = arg0.method27803(this.anIntArray515[arg0.aClass75_1.anInt223 * -1270946121], arg1);
		this.method35943(arg0.aClass75_1, local12);
	}

	@OriginalMember(owner = "client!vx", name = "ak", descriptor = "(Lclient!ji;II)V", line = 92)
	public void method32136(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method27803(this.anIntArray516[arg0.aClass75_1.anInt223 * -1270946121], arg1);
			this.method32135(arg0.aClass75_1, local12);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!vx", name = "ar", descriptor = "(Lclient!ji;I)V", line = 92)
	public void method32137(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method27803(this.anIntArray516[arg0.aClass75_1.anInt223 * -1270946121], arg1);
			this.method32135(arg0.aClass75_1, local12);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!vx", name = "s", descriptor = "(Lclient!ci;)J", line = 99)
	@Override
	public long method35952(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "z", descriptor = "(Lclient!ci;)J", line = 99)
	@Override
	public long method35955(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "c", descriptor = "(Lclient!ci;B)J", line = 99)
	@Override
	public long method35950(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "r", descriptor = "(Lclient!ci;)J", line = 99)
	@Override
	public long method35956(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "g", descriptor = "(Lclient!ci;)J", line = 99)
	@Override
	public long method35954(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "k", descriptor = "(Lclient!ci;J)V", line = 103)
	@Override
	public void method35953(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "j", descriptor = "(Lclient!ci;J)V", line = 103)
	@Override
	public void method35944(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "i", descriptor = "(Lclient!ci;J)V", line = 103)
	@Override
	public void method35942(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "v", descriptor = "(Lclient!ci;J)V", line = 103)
	@Override
	public void method35945(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "l", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 107)
	@Override
	public Object method35949(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "u", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 107)
	@Override
	public Object method35957(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "e", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 107)
	@Override
	public Object method35958(@OriginalArg(0) Class75 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "y", descriptor = "(Lclient!ci;Ljava/lang/Object;B)V", line = 111)
	@Override
	public void method35946(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "f", descriptor = "(Lclient!ci;Ljava/lang/Object;)V", line = 111)
	@Override
	public void method35959(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!vx", name = "e", descriptor = "(Lclient!dv;Lclient!zx;Lclient!zx;B)V", line = 168)
	public static final void method32138(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) Class151 arg2) {
		if (arg1.method23476() && arg2.method23476()) {
			@Pc(10) Class234 local10 = arg1.aClass234_5;
			@Pc(13) Class234 local13 = arg2.aClass234_5;
			arg0.method6778(arg1.aClass688_9.aClass77_Sub1_Sub17_2, arg1.aClass688_9.anInt5874 * 1321112311, arg1.aClass688_9.aClass77_Sub1_Sub17_1, arg1.aClass688_9.anInt5873 * 1289223255, arg1.anInt3160 * -1237559381, local10.anIntArray377[arg1.anInt3161 * -1485754087], arg2.aClass688_9.aClass77_Sub1_Sub17_2, arg2.aClass688_9.anInt5874 * 1321112311, arg2.aClass688_9.aClass77_Sub1_Sub17_1, arg2.aClass688_9.anInt5873 * 1289223255, arg2.anInt3160 * -1237559381, local13.anIntArray377[arg2.anInt3161 * -1485754087], local10.aClass236_1 == null ? null : local10.aClass236_1.aBooleanArray20, local10.aBoolean646 | local13.aBoolean646);
		}
	}

	@OriginalMember(owner = "client!vx", name = "dy", descriptor = "(I)V", line = 232)
	static void method32139() {
		if (Class88.anInt610 * 204700261 < 0) {
			Class88.anInt610 = 0;
			Class136_Sub1.anInt1703 = 1421361991;
			Class136_Sub1.anInt1704 = -2017528667;
		}
		if (Class88.anInt610 * 204700261 > Class136_Sub1.anInt1676) {
			Class88.anInt610 = Class136_Sub1.anInt1676 * 704227181;
			Class136_Sub1.anInt1703 = 1421361991;
			Class136_Sub1.anInt1704 = -2017528667;
		}
		if (Class349.anInt4496 * -1636630007 < 0) {
			Class349.anInt4496 = 0;
			Class136_Sub1.anInt1703 = 1421361991;
			Class136_Sub1.anInt1704 = -2017528667;
		}
		if (Class349.anInt4496 * -1636630007 > Class136_Sub1.anInt1677) {
			Class349.anInt4496 = Class136_Sub1.anInt1677 * 980626489;
			Class136_Sub1.anInt1703 = 1421361991;
			Class136_Sub1.anInt1704 = -2017528667;
		}
	}

	@OriginalMember(owner = "client!vx", name = "q", descriptor = "(Lclient!apv;I)V", line = 280)
	public static void method32140(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class77_Sub16 local8 = (Class77_Sub16) Class77_Sub16.aClass12_12.method173((long) (arg0.anInt2867 * 1126388985));
		if (local8 == null) {
			Class458.method29495(arg0.aByte100, arg0.anIntArray274[0], arg0.anIntArray275[0], 0, null, null, arg0);
		} else {
			local8.method13438();
		}
	}

	@OriginalMember(owner = "client!vx", name = "atc", descriptor = "(Lclient!yf;I)V", line = 12930)
	static final void method32141(@OriginalArg(0) Class665 arg0) {
		Class586.method31733();
	}

	@OriginalMember(owner = "client!vx", name = "ayz", descriptor = "(Lclient!yf;I)V", line = 13612)
	static final void method32142(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
	}
}
