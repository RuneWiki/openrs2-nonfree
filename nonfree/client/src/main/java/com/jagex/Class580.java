package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xm")
public class Class580 {

	@OriginalMember(owner = "client!xm", name = "s", descriptor = "I")
	static final int anInt5444 = 32768;

	@OriginalMember(owner = "client!xm", name = "x", descriptor = "I")
	static final int anInt5446 = 1;

	@OriginalMember(owner = "client!xm", name = "ff", descriptor = "Lclient!ny;")
	public static Class359 aClass359_105;

	@OriginalMember(owner = "client!xm", name = "g", descriptor = "I")
	public int anInt5443 = 0;

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "I")
	public int anInt5445 = 0;

	@OriginalMember(owner = "client!xm", name = "h", descriptor = "Lclient!ew;")
	final Class161 aClass161_66 = new Class161(64);

	@OriginalMember(owner = "client!xm", name = "u", descriptor = "Lclient!uy;")
	Interface55 anInterface55_1 = null;

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_104;

	@OriginalMember(owner = "client!xm", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_103;

	@OriginalMember(owner = "client!xm", name = "<init>", descriptor = "(Lclient!vk;Lclient!ny;Lclient!ny;Lclient!uy;)V", line = 19)
	public Class580(@OriginalArg(0) Class530 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Interface55 arg3) {
		this.aClass359_104 = arg1;
		this.aClass359_103 = arg2;
		this.anInterface55_1 = arg3;
		if (this.aClass359_104 != null) {
			this.anInt5443 = this.aClass359_104.method26682(1) * 1222668261;
		}
		if (this.aClass359_103 != null) {
			this.anInt5445 = this.aClass359_103.method26682(1) * -533414629;
		}
	}

	@OriginalMember(owner = "client!xm", name = "l", descriptor = "(I)Lclient!ams;", line = 28)
	public Class3_Sub1_Sub13 method33210(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub13 local6 = (Class3_Sub1_Sub13) this.aClass161_66.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass359_103.method26713(1, arg0 & 0x7FFF);
		} else {
			local23 = this.aClass359_104.method26713(1, arg0);
		}
		local6 = new Class3_Sub1_Sub13();
		local6.aClass580_1 = this;
		if (local23 != null) {
			local6.method19286(new Class3_Sub41(local23));
		}
		if (arg0 >= 32768) {
			local6.method19292();
		}
		this.aClass161_66.method23222(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "p", descriptor = "(IB)Lclient!ams;", line = 28)
	public Class3_Sub1_Sub13 method33211(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub13 local6 = (Class3_Sub1_Sub13) this.aClass161_66.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass359_103.method26713(1, arg0 & 0x7FFF);
		} else {
			local23 = this.aClass359_104.method26713(1, arg0);
		}
		local6 = new Class3_Sub1_Sub13();
		local6.aClass580_1 = this;
		if (local23 != null) {
			local6.method19286(new Class3_Sub41(local23));
		}
		if (arg0 >= 32768) {
			local6.method19292();
		}
		this.aClass161_66.method23222(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "g", descriptor = "(I)Lclient!ams;", line = 28)
	public Class3_Sub1_Sub13 method33213(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub13 local6 = (Class3_Sub1_Sub13) this.aClass161_66.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass359_103.method26713(1, arg0 & 0x7FFF);
		} else {
			local23 = this.aClass359_104.method26713(1, arg0);
		}
		local6 = new Class3_Sub1_Sub13();
		local6.aClass580_1 = this;
		if (local23 != null) {
			local6.method19286(new Class3_Sub41(local23));
		}
		if (arg0 >= 32768) {
			local6.method19292();
		}
		this.aClass161_66.method23222(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "h", descriptor = "(I)Lclient!ams;", line = 28)
	public Class3_Sub1_Sub13 method33214(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub13 local6 = (Class3_Sub1_Sub13) this.aClass161_66.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass359_103.method26713(1, arg0 & 0x7FFF);
		} else {
			local23 = this.aClass359_104.method26713(1, arg0);
		}
		local6 = new Class3_Sub1_Sub13();
		local6.aClass580_1 = this;
		if (local23 != null) {
			local6.method19286(new Class3_Sub41(local23));
		}
		if (arg0 >= 32768) {
			local6.method19292();
		}
		this.aClass161_66.method23222(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!xm", name = "a", descriptor = "(Lclient!uh;[IJ)Ljava/lang/String;", line = 42)
	String method33212(@OriginalArg(0) Class502 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface55_1 != null) {
			@Pc(9) String local9 = this.anInterface55_1.method25508(arg0, arg1, arg2);
			if (local9 != null) {
				return local9;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!xm", name = "jc", descriptor = "(Lclient!ahn;IZZI)V", line = 5973)
	static final void method33215(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(37) int local37;
		@Pc(46) int local46;
		if (arg0 instanceof Class26_Sub1_Sub1 && arg0 instanceof Interface43) {
			@Pc(8) Class26_Sub1_Sub1 local8 = (Class26_Sub1_Sub1) arg0;
			@Pc(18) int local18 = local8.aShort92 - local8.aShort94 + 1 << 9;
			@Pc(28) int local28 = local8.aShort91 - local8.aShort93 + 1 << 9;
			local37 = (local8.aShort94 << 9) + local18 / 2;
			local46 = (local8.aShort93 << 9) + local28 / 2;
		} else {
			@Pc(51) Class320 local51 = arg0.method21431().aClass320_61;
			local37 = (int) local51.aFloat259;
			local46 = (int) local51.aFloat261;
		}
		Class55.method11859(arg0.aByte101, local37, local46, 0, arg1, arg2, arg3);
	}
}
