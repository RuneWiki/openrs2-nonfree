package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public class Class228 implements Interface3 {

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "Lclient!ny;")
	static Class359 aClass359_43;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_27 = new Class161(64);

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_42;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_41;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 16)
	public Class228(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		this.aClass359_42 = arg2;
		this.aClass359_41 = arg3;
		this.aClass359_42.method26682(Class185.aClass185_9.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "(II)Lclient!hf;", line = 24)
	public Class220 method24506(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_27;
		@Pc(11) Class220 local11;
		synchronized (this.aClass161_27) {
			local11 = (Class220) this.aClass161_27.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_42;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_42) {
			local39 = this.aClass359_42.method26713(Class185.aClass185_9.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class220();
		local11.aClass228_1 = this;
		if (local39 != null) {
			local11.method24365(new Class3_Sub41(local39));
		}
		@Pc(68) Class161 local68 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)Lclient!hf;", line = 24)
	public Class220 method24510(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_27;
		@Pc(11) Class220 local11;
		synchronized (this.aClass161_27) {
			local11 = (Class220) this.aClass161_27.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_42;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_42) {
			local39 = this.aClass359_42.method26713(Class185.aClass185_9.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class220();
		local11.aClass228_1 = this;
		if (local39 != null) {
			local11.method24365(new Class3_Sub41(local39));
		}
		@Pc(68) Class161 local68 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 42)
	public void method24507() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23224();
		}
	}

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "()V", line = 42)
	public void method24509() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23224();
		}
	}

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "()V", line = 42)
	public void method24511() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23224();
		}
	}

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "()V", line = 42)
	public void method24513() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23224();
		}
	}

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "()V", line = 42)
	public void method24516() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23224();
		}
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(II)V", line = 48)
	public void method24508(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 48)
	public void method24515(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(CI)Z", line = 48)
	static final boolean method24520(@OriginalArg(0) char arg0) {
		return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "(I)V", line = 54)
	public void method24512() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23245();
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "()V", line = 54)
	public void method24514() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23245();
		}
	}

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "()V", line = 54)
	public void method24517() {
		@Pc(3) Class161 local3 = this.aClass161_27;
		synchronized (this.aClass161_27) {
			this.aClass161_27.method23245();
		}
	}

	@OriginalMember(owner = "client!hp", name = "bf", descriptor = "(IIB)I", line = 82)
	static int method24521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class456.aClass456_5.anInt5061 * 821735799 || arg0 == Class456.aClass456_14.anInt5061 * 821735799 ? Class26_Sub1_Sub3_Sub1.anIntArray172[arg1 & 0x3] : Class26_Sub1_Sub3_Sub1.anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!hp", name = "ez", descriptor = "(I)V", line = 1346)
	static void method24522() {
		if (Class527.aClass527_10 == Class1.aClass527_1) {
			Class570.aClass585_6.anInt5459 = 179972849;
			Class570.aClass585_6.anInt5457 = 123458448;
		} else if (Class1.aClass527_1.method32423(Class540.aClass540_2)) {
			Class570.aClass585_5.anInt5459 = Class570.aClass585_5.anInt5458 * -1027819553 + 117580992;
			Class570.aClass585_5.anInt5457 = Class570.aClass585_5.anInt5458 * 550241065 + -147881328;
			Class570.aClass585_6.anInt5459 = Class570.aClass585_6.anInt5458 * -1027819553 + 117580992;
			Class570.aClass585_6.anInt5457 = Class570.aClass585_6.anInt5458 * 550241065 + 1338898016;
		} else if (Class527.aClass527_6 == Class1.aClass527_1) {
			Class570.aClass585_5.anInt5459 = Class570.aClass585_5.anInt5458 * -1027819553 + 117580992;
			Class570.aClass585_5.anInt5457 = Class570.aClass585_5.anInt5458 * 550241065 + -147881328;
			Class570.aClass585_6.anInt5459 = Class570.aClass585_6.anInt5458 * -1027819553 + 117580992;
			Class570.aClass585_6.anInt5457 = Class570.aClass585_6.anInt5458 * 550241065 + 1338898016;
		}
	}

	@OriginalMember(owner = "client!hp", name = "bt", descriptor = "([IB)Ljava/lang/String;", line = 1401)
	static String method24519(@OriginalArg(0) int[] arg0) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		@Pc(7) int local7 = Class578.anInt5441 * -1466708161;
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(20) Class503 local20 = Class239.aClass505_1.method29516(arg0[local9]);
			if (local20.anInt5254 * 1337802881 != -1) {
				@Pc(36) Class6 local36 = (Class6) Class250.aClass161_30.method23219((long) (local20.anInt5254 * 1337802881));
				if (local36 == null) {
					@Pc(46) Class15 local46 = Class137.method22938(Class294.aClass359_54, local20.anInt5254 * 1337802881, 0);
					if (local46 != null) {
						local36 = Class613.aClass21_13.method17089(local46, true);
						Class250.aClass161_30.method23222(local36, (long) (local20.anInt5254 * 1337802881));
					}
				}
				if (local36 != null) {
					Class354.aClass6Array13[local7] = local36;
					local3.append(" <img=").append(local7).append(">");
					local7++;
				}
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!hp", name = "auv", descriptor = "(Lclient!vs;B)V", line = 12601)
	static final void method24518(@OriginalArg(0) Class536 arg0) {
		@Pc(3) Class26_Sub1_Sub1_Sub1_Sub1 local3 = (Class26_Sub1_Sub1_Sub1_Sub1) arg0.aClass26_Sub1_Sub1_Sub1_4;
		@Pc(6) Class571 local6 = local3.aClass571_1;
		if (local6.anIntArray508 != null) {
			local6 = local6.method33044(Class424.aClass165_1, Class424.aClass165_1);
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local6 == null ? 0 : 1;
	}
}
