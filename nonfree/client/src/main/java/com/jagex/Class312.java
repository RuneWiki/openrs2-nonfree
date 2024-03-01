package com.jagex;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ly")
public class Class312 {

	@OriginalMember(owner = "client!ly", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_34 = new Class161(20);

	@OriginalMember(owner = "client!ly", name = "h", descriptor = "Ljava/util/Map;")
	Map aMap11 = null;

	@OriginalMember(owner = "client!ly", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_56;

	@OriginalMember(owner = "client!ly", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_55;

	@OriginalMember(owner = "client!ly", name = "l", descriptor = "[I")
	final int[] anIntArray412;

	@OriginalMember(owner = "client!ly", name = "a", descriptor = "([Ljava/lang/String;[SIII)V", line = 13)
	static void method25817(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) short local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(63) String local63 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) short local77 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method25817(arg0, arg1, arg2, local10 - 1);
		method25817(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!ly", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;[I)V", line = 17)
	public Class312(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) int[] arg2) {
		this.aClass359_56 = arg0;
		this.aClass359_55 = arg1;
		if (arg2 == null) {
			this.anIntArray412 = null;
		} else {
			this.anIntArray412 = arg2;
		}
	}

	@OriginalMember(owner = "client!ly", name = "z", descriptor = "(Lclient!lj;)V", line = 25)
	public void method25791(@OriginalArg(0) Interface34 arg0) {
		this.aMap11 = new HashMap(this.anIntArray412.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray412.length; local9++) {
			@Pc(19) int local19 = this.anIntArray412[local9];
			@Pc(25) Class611 local25 = Class179.method23534(this.aClass359_55, local19);
			@Pc(31) byte[] local31 = this.aClass359_56.method26705(local19);
			@Pc(38) Object local38 = arg0.method25550(local31, local25, true);
			this.aMap11.put(local9, new Class576(local38, local25));
		}
	}

	@OriginalMember(owner = "client!ly", name = "j", descriptor = "(Lclient!lj;)V", line = 25)
	public void method25792(@OriginalArg(0) Interface34 arg0) {
		this.aMap11 = new HashMap(this.anIntArray412.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray412.length; local9++) {
			@Pc(19) int local19 = this.anIntArray412[local9];
			@Pc(25) Class611 local25 = Class179.method23534(this.aClass359_55, local19);
			@Pc(31) byte[] local31 = this.aClass359_56.method26705(local19);
			@Pc(38) Object local38 = arg0.method25550(local31, local25, true);
			this.aMap11.put(local9, new Class576(local38, local25));
		}
	}

	@OriginalMember(owner = "client!ly", name = "p", descriptor = "(Lclient!lj;I)V", line = 25)
	public void method25797(@OriginalArg(0) Interface34 arg0) {
		this.aMap11 = new HashMap(this.anIntArray412.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray412.length; local9++) {
			@Pc(19) int local19 = this.anIntArray412[local9];
			@Pc(25) Class611 local25 = Class179.method23534(this.aClass359_55, local19);
			@Pc(31) byte[] local31 = this.aClass359_56.method26705(local19);
			@Pc(38) Object local38 = arg0.method25550(local31, local25, true);
			this.aMap11.put(local9, new Class576(local38, local25));
		}
	}

	@OriginalMember(owner = "client!ly", name = "e", descriptor = "()V", line = 36)
	public void method25780() {
		this.aMap11 = null;
	}

	@OriginalMember(owner = "client!ly", name = "n", descriptor = "()V", line = 36)
	public void method25794() {
		this.aMap11 = null;
	}

	@OriginalMember(owner = "client!ly", name = "a", descriptor = "(B)V", line = 36)
	public void method25803() {
		this.aMap11 = null;
	}

	@OriginalMember(owner = "client!ly", name = "g", descriptor = "(B)I", line = 40)
	public int method25782() {
		return this.method25781(false);
	}

	@OriginalMember(owner = "client!ly", name = "r", descriptor = "()I", line = 40)
	public int method25789() {
		return this.method25781(false);
	}

	@OriginalMember(owner = "client!ly", name = "d", descriptor = "()I", line = 40)
	public int method25800() {
		return this.method25781(false);
	}

	@OriginalMember(owner = "client!ly", name = "q", descriptor = "()I", line = 40)
	public int method25809() {
		return this.method25781(false);
	}

	@OriginalMember(owner = "client!ly", name = "l", descriptor = "(ZB)I", line = 44)
	public int method25781(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray412 == null) {
			return 0;
		} else if (arg0 || this.aMap11 == null) {
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray412.length; local19++) {
				@Pc(29) int local29 = this.anIntArray412[local19];
				if (this.aClass359_56.method26674(local29)) {
					local17++;
				}
				if (this.aClass359_55.method26674(local29)) {
					local17++;
				}
			}
			return local17;
		} else {
			return this.anIntArray412.length * 2;
		}
	}

	@OriginalMember(owner = "client!ly", name = "m", descriptor = "(Z)I", line = 44)
	public int method25798(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray412 == null) {
			return 0;
		} else if (arg0 || this.aMap11 == null) {
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray412.length; local19++) {
				@Pc(29) int local29 = this.anIntArray412[local19];
				if (this.aClass359_56.method26674(local29)) {
					local17++;
				}
				if (this.aClass359_55.method26674(local29)) {
					local17++;
				}
			}
			return local17;
		} else {
			return this.anIntArray412.length * 2;
		}
	}

	@OriginalMember(owner = "client!ly", name = "v", descriptor = "(Z)I", line = 44)
	public int method25799(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray412 == null) {
			return 0;
		} else if (arg0 || this.aMap11 == null) {
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray412.length; local19++) {
				@Pc(29) int local29 = this.anIntArray412[local19];
				if (this.aClass359_56.method26674(local29)) {
					local17++;
				}
				if (this.aClass359_55.method26674(local29)) {
					local17++;
				}
			}
			return local17;
		} else {
			return this.anIntArray412.length * 2;
		}
	}

	@OriginalMember(owner = "client!ly", name = "h", descriptor = "(I)I", line = 56)
	public int method25784() {
		return this.anIntArray412 == null ? 0 : this.anIntArray412.length * 2;
	}

	@OriginalMember(owner = "client!ly", name = "i", descriptor = "()I", line = 56)
	public int method25795() {
		return this.anIntArray412 == null ? 0 : this.anIntArray412.length * 2;
	}

	@OriginalMember(owner = "client!ly", name = "w", descriptor = "()I", line = 56)
	public int method25801() {
		return this.anIntArray412 == null ? 0 : this.anIntArray412.length * 2;
	}

	@OriginalMember(owner = "client!ly", name = "o", descriptor = "()I", line = 56)
	public int method25802() {
		return this.anIntArray412 == null ? 0 : this.anIntArray412.length * 2;
	}

	@OriginalMember(owner = "client!ly", name = "t", descriptor = "()I", line = 56)
	public int method25805() {
		return this.anIntArray412 == null ? 0 : this.anIntArray412.length * 2;
	}

	@OriginalMember(owner = "client!ly", name = "x", descriptor = "(Lclient!lj;IZZI)Ljava/lang/Object;", line = 61)
	public Object method25785(@OriginalArg(0) Interface34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class576 local7 = this.method25787(arg0, arg1, arg2, arg3);
		return local7 == null ? null : local7.anObject27;
	}

	@OriginalMember(owner = "client!ly", name = "f", descriptor = "(Lclient!lj;IZZ)Ljava/lang/Object;", line = 61)
	public Object method25793(@OriginalArg(0) Interface34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class576 local7 = this.method25787(arg0, arg1, arg2, arg3);
		return local7 == null ? null : local7.anObject27;
	}

	@OriginalMember(owner = "client!ly", name = "s", descriptor = "(Lclient!lj;II)Lclient!yx;", line = 67)
	public Class611 method25786(@OriginalArg(0) Interface34 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class576 local7 = this.method25787(arg0, arg1, true, true);
		return local7 == null ? null : (Class611) local7.anObject26;
	}

	@OriginalMember(owner = "client!ly", name = "u", descriptor = "(Lclient!lj;IZZI)Lclient!xi;", line = 73)
	Class576 method25787(@OriginalArg(0) Interface34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray412 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray412.length; local9++) {
				if (this.anIntArray412[local9] == arg1) {
					return (Class576) this.aMap11.get(local9);
				}
			}
		}
		@Pc(44) Class576 local44 = (Class576) this.aClass161_34.method23219((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			if (arg2 && local44.anObject26 == null) {
				@Pc(58) Class611 local58 = Class179.method23534(this.aClass359_55, arg1);
				if (local58 == null) {
					return null;
				}
				local44.anObject26 = local58;
			}
			return local44;
		}
		@Pc(73) byte[] local73 = this.aClass359_56.method26705(arg1);
		if (local73 == null) {
			return null;
		}
		@Pc(84) Class611 local84 = Class179.method23534(this.aClass359_55, arg1);
		if (local84 == null) {
			return null;
		}
		if (arg2) {
			local44 = new Class576(arg0.method25550(local73, local84, arg3), local84);
		} else {
			local44 = new Class576(arg0.method25550(local73, local84, arg3), null);
		}
		this.aClass161_34.method23222(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
		return local44;
	}

	@OriginalMember(owner = "client!ly", name = "at", descriptor = "(Lclient!lj;IZZ)Lclient!xi;", line = 73)
	Class576 method25796(@OriginalArg(0) Interface34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray412 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray412.length; local9++) {
				if (this.anIntArray412[local9] == arg1) {
					return (Class576) this.aMap11.get(local9);
				}
			}
		}
		@Pc(44) Class576 local44 = (Class576) this.aClass161_34.method23219((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			if (arg2 && local44.anObject26 == null) {
				@Pc(58) Class611 local58 = Class179.method23534(this.aClass359_55, arg1);
				if (local58 == null) {
					return null;
				}
				local44.anObject26 = local58;
			}
			return local44;
		}
		@Pc(73) byte[] local73 = this.aClass359_56.method26705(arg1);
		if (local73 == null) {
			return null;
		}
		@Pc(84) Class611 local84 = Class179.method23534(this.aClass359_55, arg1);
		if (local84 == null) {
			return null;
		}
		if (arg2) {
			local44 = new Class576(arg0.method25550(local73, local84, arg3), local84);
		} else {
			local44 = new Class576(arg0.method25550(local73, local84, arg3), null);
		}
		this.aClass161_34.method23222(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
		return local44;
	}

	@OriginalMember(owner = "client!ly", name = "k", descriptor = "(Lclient!lj;IZZ)Lclient!xi;", line = 73)
	Class576 method25806(@OriginalArg(0) Interface34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray412 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray412.length; local9++) {
				if (this.anIntArray412[local9] == arg1) {
					return (Class576) this.aMap11.get(local9);
				}
			}
		}
		@Pc(44) Class576 local44 = (Class576) this.aClass161_34.method23219((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			if (arg2 && local44.anObject26 == null) {
				@Pc(58) Class611 local58 = Class179.method23534(this.aClass359_55, arg1);
				if (local58 == null) {
					return null;
				}
				local44.anObject26 = local58;
			}
			return local44;
		}
		@Pc(73) byte[] local73 = this.aClass359_56.method26705(arg1);
		if (local73 == null) {
			return null;
		}
		@Pc(84) Class611 local84 = Class179.method23534(this.aClass359_55, arg1);
		if (local84 == null) {
			return null;
		}
		if (arg2) {
			local44 = new Class576(arg0.method25550(local73, local84, arg3), local84);
		} else {
			local44 = new Class576(arg0.method25550(local73, local84, arg3), null);
		}
		this.aClass161_34.method23222(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
		return local44;
	}

	@OriginalMember(owner = "client!ly", name = "x", descriptor = "(J)V", line = 88)
	static void method25816(@OriginalArg(0) long arg0) {
		Class599.aCalendar3.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!ly", name = "y", descriptor = "(I)V", line = 99)
	public void method25788() {
		this.aClass161_34.method23224();
	}

	@OriginalMember(owner = "client!ly", name = "af", descriptor = "()V", line = 99)
	public void method25807() {
		this.aClass161_34.method23224();
	}

	@OriginalMember(owner = "client!ly", name = "ak", descriptor = "()V", line = 99)
	public void method25808() {
		this.aClass161_34.method23224();
	}

	@OriginalMember(owner = "client!ly", name = "aa", descriptor = "(I)V", line = 103)
	public void method25804(@OriginalArg(0) int arg0) {
		this.aClass161_34.method23240(arg0);
	}

	@OriginalMember(owner = "client!ly", name = "ah", descriptor = "(I)V", line = 103)
	public void method25810(@OriginalArg(0) int arg0) {
		this.aClass161_34.method23240(arg0);
	}

	@OriginalMember(owner = "client!ly", name = "b", descriptor = "(IB)V", line = 103)
	public void method25811(@OriginalArg(0) int arg0) {
		this.aClass161_34.method23240(arg0);
	}

	@OriginalMember(owner = "client!ly", name = "an", descriptor = "()V", line = 107)
	public void method25783() {
		this.aClass161_34.method23245();
	}

	@OriginalMember(owner = "client!ly", name = "c", descriptor = "(I)V", line = 107)
	public void method25790() {
		this.aClass161_34.method23245();
	}

	@OriginalMember(owner = "client!ly", name = "aj", descriptor = "()V", line = 107)
	public void method25812() {
		this.aClass161_34.method23245();
	}

	@OriginalMember(owner = "client!ly", name = "u", descriptor = "(Lclient!and;ILclient!akp;II)V", line = 482)
	static final void method25813(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3) {
		@Pc(8) String local8;
		if ((arg3 & 0x200) != 0) {
			local8 = arg0.method20283();
			if (arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3) {
				Class121.method22823(2, 0, arg2.method16735(true), arg2.method16750(false), arg2.aString77, local8);
			}
			arg2.method16745(local8, 0, 0);
		}
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(79) boolean local79;
		@Pc(40) int local40;
		if ((arg3 & 0x1000) != 0) {
			local40 = arg0.method20315();
			local44 = arg0.method20325();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20317();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 2);
		}
		@Pc(110) int local110;
		if ((arg3 & 0x80) != 0) {
			local40 = arg0.method20310();
			@Pc(152) int local152;
			if (local40 > 0) {
				for (local44 = 0; local44 < local40; local44++) {
					local57 = -1;
					local110 = -1;
					local53 = arg0.method20334();
					if (local53 == 32767) {
						local53 = arg0.method20334();
						local63 = arg0.method20334();
						local57 = arg0.method20334();
						local110 = arg0.method20334();
					} else if (local53 == 32766) {
						local53 = -1;
						local63 = arg0.method20269();
					} else {
						local63 = arg0.method20334();
					}
					local152 = arg0.method20334();
					arg2.method16632(local53, local63, local57, local110, client.anInt3034, local152);
				}
			}
			local44 = arg0.method20310();
			if (local44 > 0) {
				for (local53 = 0; local53 < local44; local53++) {
					local57 = arg0.method20334();
					local63 = arg0.method20334();
					if (local63 == 32767) {
						arg2.method16643(local57);
					} else {
						local110 = arg0.method20334();
						local152 = arg0.method20317();
						@Pc(201) int local201 = local63 > 0 ? arg0.method20304() : local152;
						arg2.method16671(local57, client.anInt3034, local63, local110, local152, local201);
					}
				}
			}
		}
		if ((arg3 & 0x200000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20325();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20304();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 4);
		}
		if ((arg3 & 0x40000) != 0) {
			local8 = arg0.method20283();
			local44 = arg0.method20304();
			if ((local44 & 0x1) != 0) {
				Class121.method22823(2, local44, arg2.method16735(true), arg2.method16750(false), arg2.aString77, local8);
			}
			arg2.method16745(local8, 0, 0);
		}
		@Pc(324) byte[] local324;
		@Pc(329) Class3_Sub41 local329;
		if ((arg3 & 0x4) != 0) {
			local40 = arg0.method20269();
			local324 = new byte[local40];
			local329 = new Class3_Sub41(local324);
			arg0.method20326(local324, 0, local40);
			Class52.aClass3_Sub41Array1[arg1] = local329;
			arg2.method16763(local329);
		}
		if ((arg3 & 0x80000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20323();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20310();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 3);
		}
		@Pc(446) Class342 local446;
		@Pc(452) Class304 local452;
		if ((arg3 & 0x10000) != 0) {
			arg2.anInterface58_5.method33320();
			arg0.anInt2803 += -1837960662;
			local40 = arg0.aByteArray51[(arg0.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
			for (local44 = 0; local44 < local40; local44++) {
				local53 = arg0.method20269();
				local446 = (Class342) Class371.method27203(Class342.class, local53);
				local452 = Class429.aClass70_Sub1_Sub1_2.method14718(arg0, local446);
				arg2.anInterface58_5.method33310(local452.anInt4428 * 1628864065, local452.anObject17);
			}
		}
		if ((arg3 & 0x40) != 0) {
			local40 = arg0.method20314();
			if (local40 == 65535) {
				local40 = -1;
			}
			arg2.anInt2364 = local40 * -1954799489;
		}
		if ((arg3 & 0x10) != 0) {
			arg2.anInt2368 = arg0.method20390() * -1185991597;
			arg2.anInt2370 = arg0.method20390() * 364644769;
			arg2.anInt2369 = arg0.method20308() * -91651127;
			arg2.anInt2380 = arg0.method20390() * -511588031;
			arg2.anInt2372 = (arg0.method20315() + client.anInt3034) * -1076797805;
			arg2.anInt2386 = (arg0.method20271() + client.anInt3034) * 454793361;
			arg2.anInt2373 = arg0.method20313() * 1204696765;
			arg2.anInt2368 += arg2.anIntArray241[0] * -1185991597;
			arg2.anInt2370 += arg2.anIntArray239[0] * 364644769;
			arg2.anInt2369 += arg2.anIntArray241[0] * -91651127;
			arg2.anInt2380 += arg2.anIntArray239[0] * -511588031;
			arg2.anInt2362 = 2015411311;
			arg2.anInt2385 = 0;
		}
		if ((arg3 & 0x400000) != 0) {
			arg0.anInt2803 += -1837960662;
			local40 = arg0.aByteArray51[(arg0.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
			for (local44 = 0; local44 < local40; local44++) {
				local53 = arg0.method20317();
				local446 = (Class342) Class371.method27203(Class342.class, local53);
				local452 = Class429.aClass70_Sub1_Sub1_2.method14718(arg0, local446);
				arg2.anInterface58_5.method33310(local452.anInt4428 * 1628864065, local452.anObject17);
			}
		}
		if ((arg3 & 0x2000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20324();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20304();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 1);
		}
		@Pc(719) int[] local719;
		@Pc(722) int[] local722;
		if ((arg3 & 0x20000) != 0) {
			local40 = arg0.method20310();
			local719 = new int[local40];
			local722 = new int[local40];
			for (local57 = 0; local57 < local40; local57++) {
				local63 = arg0.method20313();
				if ((local63 & 0xC000) == 49152) {
					local110 = arg0.method20314();
					local719[local57] = local63 << 16 | local110;
				} else {
					local719[local57] = local63;
				}
				local722[local57] = arg0.method20313();
			}
			arg2.method16651(local719, local722);
		}
		if ((arg3 & 0x8000) != 0) {
			local40 = arg0.method20310();
			local719 = new int[local40];
			local722 = new int[local40];
			@Pc(783) int[] local783 = new int[local40];
			for (local63 = 0; local63 < local40; local63++) {
				local719[local63] = arg0.method20375();
				local722[local63] = arg0.method20317();
				local783[local63] = arg0.method20315();
			}
			Class227.method24505(arg2, local719, local722, local783);
		}
		if ((arg3 & 0x100000) != 0) {
			arg2.aBoolean419 = arg0.method20317() == 1;
		}
		if ((arg3 & 0x400) != 0) {
			arg2.aBoolean420 = arg0.method20317() == 1;
		}
		if ((arg3 & 0x800) != 0) {
			local40 = arg0.method20317();
			local324 = new byte[local40];
			local329 = new Class3_Sub41(local324);
			arg0.method20384(local324, 0, local40);
			Class52.aClass3_Sub41Array2[arg1] = local329;
			arg2.method16731(local329);
		}
		if ((arg3 & 0x1) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20275();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20310();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 0);
		}
		if ((arg3 & 0x8) != 0) {
			@Pc(938) int[] local938 = new int[4];
			for (local44 = 0; local44 < 4; local44++) {
				local938[local44] = arg0.method20375();
			}
			local44 = arg0.method20310();
			Class435.method27993(arg2, local938, local44, false);
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.aByte74 = arg0.method20307();
			arg2.aByte72 = arg0.method20308();
			arg2.aByte75 = arg0.method20308();
			arg2.aByte76 = (byte) arg0.method20304();
			arg2.anInt2374 = (client.anInt3034 + arg0.method20313()) * -601452769;
			arg2.anInt2375 = (client.anInt3034 + arg0.method20313()) * -1061195387;
		}
		if ((arg3 & 0x2) == 0) {
			return;
		}
		arg2.anInt2395 = arg0.method20315() * -1905570099;
		if (arg2.anInt2362 * -162520433 == 0) {
			arg2.method16633(arg2.anInt2395 * 1668894213);
			arg2.anInt2395 = 1905570099;
		}
	}

	@OriginalMember(owner = "client!ly", name = "mb", descriptor = "(Lclient!vs;B)V", line = 6441)
	static final void method25814(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class375.method27229(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ly", name = "vr", descriptor = "(Lclient!vs;I)V", line = 7984)
	static final void method25818(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub1.method8404(local13, local23, true, false);
	}

	@OriginalMember(owner = "client!ly", name = "alu", descriptor = "(Lclient!vs;B)V", line = 11171)
	static final void method25815(@OriginalArg(0) Class536 arg0) {
		Class276.method25389();
	}
}
