package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public class Class413 {

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "Lclient!xs;")
	public static Class585 aClass585_2;

	@OriginalMember(owner = "client!qo", name = "it", descriptor = "Lclient!un;")
	static Class507 aClass507_1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_36 = new Class161(16);

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_67;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 18)
	public Class413(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_67 = arg2;
		this.aClass359_67.method26682(Class185.aClass185_35.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "(IB)Lclient!qv;", line = 25)
	Class418 method27709(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_36;
		@Pc(11) Class418 local11;
		synchronized (this.aClass161_36) {
			local11 = (Class418) this.aClass161_36.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_67;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_67) {
			local38 = this.aClass359_67.method26713(Class185.aClass185_35.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class418();
		if (local38 != null) {
			local11.method27823(new Class3_Sub41(local38));
		}
		@Pc(64) Class161 local64 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "(I)Lclient!qv;", line = 25)
	Class418 method27713(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_36;
		@Pc(11) Class418 local11;
		synchronized (this.aClass161_36) {
			local11 = (Class418) this.aClass161_36.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_67;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_67) {
			local38 = this.aClass359_67.method26713(Class185.aClass185_35.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class418();
		if (local38 != null) {
			local11.method27823(new Class3_Sub41(local38));
		}
		@Pc(64) Class161 local64 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "(I)Lclient!qv;", line = 25)
	Class418 method27719(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_36;
		@Pc(11) Class418 local11;
		synchronized (this.aClass161_36) {
			local11 = (Class418) this.aClass161_36.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_67;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_67) {
			local38 = this.aClass359_67.method26713(Class185.aClass185_35.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class418();
		if (local38 != null) {
			local11.method27823(new Class3_Sub41(local38));
		}
		@Pc(64) Class161 local64 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)Lclient!vz;", line = 29)
	public static Class543 method27727(@OriginalArg(0) int arg0) {
		@Pc(2) Class543[] local2 = Class529.method32459();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class543 local12 = local2[local4];
			if (local12.anInt5326 * 1050721143 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIILclient!gk;B)Lclient!po;", line = 42)
	public Class395 method27710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class200 arg4) {
		@Pc(1) Class386[] local1 = null;
		@Pc(6) Class418 local6 = this.method27709(arg0);
		if (local6.anIntArray433 != null) {
			local1 = new Class386[local6.anIntArray433.length];
			for (@Pc(16) int local16 = 0; local16 < local1.length; local16++) {
				@Pc(28) Class213 local28 = arg4.method24136(local6.anIntArray433[local16]);
				local1[local16] = new Class386(local28.anInt3705 * 2134960643, local28.anInt3711 * 1238593803, local28.anInt3707 * -809296895, local28.anInt3708 * -857221241, local28.anInt3709 * 855530633, local28.anInt3706 * -372544829, local28.anInt3713 * 549932817, local28.aBoolean667, local28.anInt3712 * 1508507725, local28.anInt3710 * 558981237, local28.anInt3714 * -1708466357);
			}
		}
		return new Class395(local6.anInt4838 * 1338376507, local1, local6.anInt4837 * 1330210697, arg1, arg2, arg3, local6.aClass412_4, local6.anInt4839 * 1604938559);
	}

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "(IIIILclient!gk;)Lclient!po;", line = 42)
	public Class395 method27718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class200 arg4) {
		@Pc(1) Class386[] local1 = null;
		@Pc(6) Class418 local6 = this.method27709(arg0);
		if (local6.anIntArray433 != null) {
			local1 = new Class386[local6.anIntArray433.length];
			for (@Pc(16) int local16 = 0; local16 < local1.length; local16++) {
				@Pc(28) Class213 local28 = arg4.method24136(local6.anIntArray433[local16]);
				local1[local16] = new Class386(local28.anInt3705 * 2134960643, local28.anInt3711 * 1238593803, local28.anInt3707 * -809296895, local28.anInt3708 * -857221241, local28.anInt3709 * 855530633, local28.anInt3706 * -372544829, local28.anInt3713 * 549932817, local28.aBoolean667, local28.anInt3712 * 1508507725, local28.anInt3710 * 558981237, local28.anInt3714 * -1708466357);
			}
		}
		return new Class395(local6.anInt4838 * 1338376507, local1, local6.anInt4837 * 1330210697, arg1, arg2, arg3, local6.aClass412_4, local6.anInt4839 * 1604938559);
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)V", line = 55)
	public void method27711() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23224();
		}
	}

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "()V", line = 55)
	public void method27715() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23224();
		}
	}

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "()V", line = 55)
	public void method27716() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23224();
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()V", line = 55)
	public void method27717() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23224();
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "()V", line = 55)
	public void method27720() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23224();
		}
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "(IB)V", line = 61)
	public void method27708(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "(I)V", line = 61)
	public void method27712(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "(I)V", line = 61)
	public void method27721(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V", line = 61)
	public void method27722(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "(I)V", line = 67)
	public void method27714() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23245();
		}
	}

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "()V", line = 67)
	public void method27723() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23245();
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()V", line = 67)
	public void method27724() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23245();
		}
	}

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "()V", line = 67)
	public void method27725() {
		@Pc(3) Class161 local3 = this.aClass161_36;
		synchronized (this.aClass161_36) {
			this.aClass161_36.method23245();
		}
	}

	@OriginalMember(owner = "client!qo", name = "aqq", descriptor = "(Lclient!vs;I)V", line = 11955)
	static final void method27726(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (Class178.aClass186Array1[local13] == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class178.aClass186Array1[local13].aClass178Array8[local23].anInt3555 * 364275073;
		}
	}
}
