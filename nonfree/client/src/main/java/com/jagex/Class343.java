package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public class Class343 implements Interface11 {

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "[I")
	static int[] anIntArray441 = new int[32];

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "Lclient!pd;")
	Class127 aClass127_73;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Lclient!ci;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	int anInt4484;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
	int anInt4485;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Ljava/lang/String;")
	String aString206;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	int anInt4487 = 1818307695;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
	public int anInt4486;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!kg;")
	Class111 aClass111_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray441[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILclient!kg;)V", line = 30)
	Class343(@OriginalArg(0) int arg0, @OriginalArg(1) Class111 arg1) {
		this.anInt4486 = arg0 * 383904583;
		this.aClass111_1 = arg1;
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "(Lclient!akv;)V", line = 36)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method27793(arg0, false);
	}

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "(Lclient!akv;B)V", line = 36)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method27793(arg0, false);
	}

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "(Lclient!akv;)V", line = 36)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method27793(arg0, false);
	}

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "(Lclient!akv;)V", line = 36)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method27793(arg0, false);
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "(Lclient!akv;ZI)V", line = 41)
	void method27793(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27795(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)I", line = 43)
	public static int method27794() {
		Class418.method28682();
		return Class636.aClass142_5.anInt2016 * 756058023;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 47)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "()V", line = 47)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "()V", line = 47)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "(Lclient!akv;IZI)V", line = 50)
	void method27795(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class349 local6 = (Class349) Class457.method29479(Class407.method28544(), arg1);
		switch(local6.anInt4493 * -1254923905) {
			case 4:
			default:
				break;
			case 11:
				this.anInt4484 = arg0.method22478() * -778147733;
				this.anInt4485 = arg0.method22478() * 1263787473;
				break;
			case 13:
				@Pc(15) int local15 = arg0.method22478();
				this.aClass127_73 = (Class127) Class457.method29479(Class127.method13144(), local15);
				if (this.aClass127_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4487 = arg0.method22549() * -1818307695;
				if (this.aClass111_1 != null) {
					@Pc(51) Interface13 local51 = (Interface13) this.aClass111_1.aMap12.get(this.aClass127_73);
					if (local51 != null) {
						this.aClass75_1 = (Class75) local51.method18319(this.anInt4487 * 2015513969);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "(Lclient!akv;IZ)V", line = 50)
	void method27796(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class349 local6 = (Class349) Class457.method29479(Class407.method28544(), arg1);
		switch(local6.anInt4493 * -1254923905) {
			case 4:
			default:
				break;
			case 11:
				this.anInt4484 = arg0.method22478() * -778147733;
				this.anInt4485 = arg0.method22478() * 1263787473;
				break;
			case 13:
				@Pc(15) int local15 = arg0.method22478();
				this.aClass127_73 = (Class127) Class457.method29479(Class127.method13144(), local15);
				if (this.aClass127_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4487 = arg0.method22549() * -1818307695;
				if (this.aClass111_1 != null) {
					@Pc(51) Interface13 local51 = (Interface13) this.aClass111_1.aMap12.get(this.aClass127_73);
					if (local51 != null) {
						this.aClass75_1 = (Class75) local51.method18319(this.anInt4487 * 2015513969);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "(Lclient!akv;IZ)V", line = 50)
	void method27797(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class349 local6 = (Class349) Class457.method29479(Class407.method28544(), arg1);
		switch(local6.anInt4493 * -1254923905) {
			case 4:
			default:
				break;
			case 11:
				this.anInt4484 = arg0.method22478() * -778147733;
				this.anInt4485 = arg0.method22478() * 1263787473;
				break;
			case 13:
				@Pc(15) int local15 = arg0.method22478();
				this.aClass127_73 = (Class127) Class457.method29479(Class127.method13144(), local15);
				if (this.aClass127_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4487 = arg0.method22549() * -1818307695;
				if (this.aClass111_1 != null) {
					@Pc(51) Interface13 local51 = (Interface13) this.aClass111_1.aMap12.get(this.aClass127_73);
					if (local51 != null) {
						this.aClass75_1 = (Class75) local51.method18319(this.anInt4487 * 2015513969);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(Lclient!akv;IZ)V", line = 50)
	void method27798(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class349 local6 = (Class349) Class457.method29479(Class407.method28544(), arg1);
		switch(local6.anInt4493 * -1254923905) {
			case 4:
			default:
				break;
			case 11:
				this.anInt4484 = arg0.method22478() * -778147733;
				this.anInt4485 = arg0.method22478() * 1263787473;
				break;
			case 13:
				@Pc(15) int local15 = arg0.method22478();
				this.aClass127_73 = (Class127) Class457.method29479(Class127.method13144(), local15);
				if (this.aClass127_73 == null) {
					throw new IllegalStateException("");
				}
				this.anInt4487 = arg0.method22549() * -1818307695;
				if (this.aClass111_1 != null) {
					@Pc(51) Interface13 local51 = (Interface13) this.aClass111_1.aMap12.get(this.aClass127_73);
					if (local51 != null) {
						this.aClass75_1 = (Class75) local51.method18319(this.anInt4487 * 2015513969);
					} else if (!arg2) {
						throw new IllegalStateException("");
					}
				}
		}
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)I", line = 83)
	public int method27799(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray441[this.anInt4485 * 1133878065 - this.anInt4484 * 469435459];
		return arg0 >> this.anInt4484 * 469435459 & local11;
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)I", line = 83)
	public int method27800(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray441[this.anInt4485 * 1133878065 - this.anInt4484 * 469435459];
		return arg0 >> this.anInt4484 * 469435459 & local11;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)I", line = 83)
	public int method27801(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray441[this.anInt4485 * 1133878065 - this.anInt4484 * 469435459];
		return arg0 >> this.anInt4484 * 469435459 & local11;
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(II)I", line = 88)
	public int method27802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(11) int local11 = anIntArray441[this.anInt4485 * 1133878065 - this.anInt4484 * 469435459];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub6(this.aString206 == null ? Integer.toString(this.anInt4486 * 206851703) : this.aString206, arg1, local11);
		}
		local11 <<= this.anInt4484 * 469435459;
		return arg0 & ~local11 | arg1 << this.anInt4484 * 469435459 & local11;
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "(IIB)I", line = 88)
	public int method27803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(11) int local11 = anIntArray441[this.anInt4485 * 1133878065 - this.anInt4484 * 469435459];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub6(this.aString206 == null ? Integer.toString(this.anInt4486 * 206851703) : this.aString206, arg1, local11);
		}
		local11 <<= this.anInt4484 * 469435459;
		return arg0 & ~local11 | arg1 << this.anInt4484 * 469435459 & local11;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(Lclient!yf;B)V", line = 100)
	static void method27804(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 2])).aStringArray28[arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1]];
		arg0.anInt5784 -= 617999126;
	}

	@OriginalMember(owner = "client!ji", name = "zs", descriptor = "(Lclient!yf;B)V", line = 9147)
	static final void method27805(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26054(local12).method25969() ? 1 : 0;
	}
}
