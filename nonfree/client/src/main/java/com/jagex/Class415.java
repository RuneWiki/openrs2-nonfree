package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public class Class415 implements Interface1 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!pw;")
	static Class478 aClass478_118;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	static int anInt4719;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!er;")
	final Class232 aClass232_82 = new Class232(20);

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!er;")
	final Class232 aClass232_83 = new Class232(20);

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!dx;")
	Class86 aClass86_11 = null;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Ljava/util/Map;")
	Map aMap19 = null;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_117;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_116;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "[I")
	final int[] anIntArray461;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!er;")
	Class232 aClass232_84;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!dx;Lclient!pw;Lclient!pw;[I)V", line = 25)
	public Class415(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass86_11 = arg0;
		this.aClass478_117 = arg1;
		this.aClass478_116 = arg2;
		this.anIntArray461 = arg3;
		this.aClass232_84 = new Class232(20);
	}

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "(Lclient!nu;I)V", line = 34)
	public void method28624(@OriginalArg(0) Interface51 arg0) {
		this.aMap19 = new HashMap(this.anIntArray461.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray461.length; local9++) {
			@Pc(19) int local19 = this.anIntArray461[local9];
			@Pc(26) Class17 local26 = Class21.method418(this.aClass478_116, local19, this);
			@Pc(32) byte[] local32 = this.aClass478_117.method29745(local19);
			@Pc(39) Object local39 = arg0.method28276(local32, local26, true);
			this.aMap19.put(local9, new Class10(local39, local26));
		}
	}

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "(Lclient!nu;)V", line = 34)
	public void method28625(@OriginalArg(0) Interface51 arg0) {
		this.aMap19 = new HashMap(this.anIntArray461.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray461.length; local9++) {
			@Pc(19) int local19 = this.anIntArray461[local9];
			@Pc(26) Class17 local26 = Class21.method418(this.aClass478_116, local19, this);
			@Pc(32) byte[] local32 = this.aClass478_117.method29745(local19);
			@Pc(39) Object local39 = arg0.method28276(local32, local26, true);
			this.aMap19.put(local9, new Class10(local39, local26));
		}
	}

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "(Lclient!nu;)V", line = 34)
	public void method28626(@OriginalArg(0) Interface51 arg0) {
		this.aMap19 = new HashMap(this.anIntArray461.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray461.length; local9++) {
			@Pc(19) int local19 = this.anIntArray461[local9];
			@Pc(26) Class17 local26 = Class21.method418(this.aClass478_116, local19, this);
			@Pc(32) byte[] local32 = this.aClass478_117.method29745(local19);
			@Pc(39) Object local39 = arg0.method28276(local32, local26, true);
			this.aMap19.put(local9, new Class10(local39, local26));
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 45)
	public void method28627() {
		this.aMap19 = null;
	}

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "()V", line = 45)
	public void method28628() {
		this.aMap19 = null;
	}

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "()V", line = 45)
	public void method28629() {
		this.aMap19 = null;
	}

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "()V", line = 45)
	public void method28630() {
		this.aMap19 = null;
	}

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "(B)I", line = 49)
	public int method28631() {
		return this.method28635(false);
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "()I", line = 49)
	public int method28632() {
		return this.method28635(false);
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "()I", line = 49)
	public int method28633() {
		return this.method28635(false);
	}

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "()I", line = 49)
	public int method28634() {
		return this.method28635(false);
	}

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "(ZB)I", line = 53)
	public int method28635(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray461 == null) {
			return 0;
		} else if (arg0 || this.aMap19 == null) {
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray461.length; local19++) {
				@Pc(29) int local29 = this.anIntArray461[local19];
				if (this.aClass478_117.method29730(local29)) {
					local17++;
				}
				if (this.aClass478_116.method29730(local29)) {
					local17++;
				}
			}
			return local17;
		} else {
			return this.anIntArray461.length * 2;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)I", line = 53)
	public int method28636(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray461 == null) {
			return 0;
		} else if (arg0 || this.aMap19 == null) {
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray461.length; local19++) {
				@Pc(29) int local29 = this.anIntArray461[local19];
				if (this.aClass478_117.method29730(local29)) {
					local17++;
				}
				if (this.aClass478_116.method29730(local29)) {
					local17++;
				}
			}
			return local17;
		} else {
			return this.anIntArray461.length * 2;
		}
	}

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "(B)I", line = 65)
	public int method28637() {
		return this.anIntArray461 == null ? 0 : this.anIntArray461.length * 2;
	}

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "()I", line = 65)
	public int method28638() {
		return this.anIntArray461 == null ? 0 : this.anIntArray461.length * 2;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()I", line = 65)
	public int method28639() {
		return this.anIntArray461 == null ? 0 : this.anIntArray461.length * 2;
	}

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "(Lclient!nu;IZZB)Ljava/lang/Object;", line = 70)
	public Object method28640(@OriginalArg(0) Interface51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray461 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray461.length; local9++) {
				if (arg1 == this.anIntArray461[local9]) {
					return ((Class10) this.aMap19.get(local9)).anObject1;
				}
			}
		}
		@Pc(44) Object local44 = this.aClass232_82.method25835((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			return local44;
		}
		@Pc(55) byte[] local55 = this.aClass478_117.method29745(arg1);
		if (local55 == null) {
			return null;
		}
		@Pc(68) Class17 local68 = this.method28645(arg0, arg1, arg2, false);
		if (local68 == null) {
			return null;
		} else {
			local44 = arg0.method28276(local55, local68, arg3);
			this.aClass232_82.method25844(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local44;
		}
	}

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "(Lclient!nu;IZZ)Ljava/lang/Object;", line = 70)
	public Object method28641(@OriginalArg(0) Interface51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray461 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray461.length; local9++) {
				if (arg1 == this.anIntArray461[local9]) {
					return ((Class10) this.aMap19.get(local9)).anObject1;
				}
			}
		}
		@Pc(44) Object local44 = this.aClass232_82.method25835((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			return local44;
		}
		@Pc(55) byte[] local55 = this.aClass478_117.method29745(arg1);
		if (local55 == null) {
			return null;
		}
		@Pc(68) Class17 local68 = this.method28645(arg0, arg1, arg2, false);
		if (local68 == null) {
			return null;
		} else {
			local44 = arg0.method28276(local55, local68, arg3);
			this.aClass232_82.method25844(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local44;
		}
	}

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "(Lclient!ci;I)V", line = 82)
	public static void method28642(@OriginalArg(0) Class75 arg0) {
		@Pc(7) Class77_Sub1_Sub6 local7 = Class456.method29469(1, (long) (arg0.anInt223 * -1270946121));
		local7.method21544();
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(Lclient!nu;I)Lclient!aar;", line = 88)
	public Class17 method28643(@OriginalArg(0) Interface51 arg0, @OriginalArg(1) int arg1) {
		return this.method28645(arg0, arg1, true, true);
	}

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "(Lclient!nu;IB)Lclient!aar;", line = 88)
	public Class17 method28644(@OriginalArg(0) Interface51 arg0, @OriginalArg(1) int arg1) {
		return this.method28645(arg0, arg1, true, true);
	}

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "(Lclient!nu;IZZI)Lclient!aar;", line = 92)
	Class17 method28645(@OriginalArg(0) Interface51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray461 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray461.length; local10++) {
				if (arg1 == this.anIntArray461[local10]) {
					return (Class17) ((Class10) this.aMap19.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass478_117.method29730(arg1);
		}
		@Pc(47) Class17 local47 = (Class17) this.aClass232_83.method25835((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class21.method418(this.aClass478_116, arg1, this);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass232_83.method25844(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!nd", name = "aj", descriptor = "(Lclient!nu;IZZ)Lclient!aar;", line = 92)
	Class17 method28646(@OriginalArg(0) Interface51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray461 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray461.length; local10++) {
				if (arg1 == this.anIntArray461[local10]) {
					return (Class17) ((Class10) this.aMap19.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass478_117.method29730(arg1);
		}
		@Pc(47) Class17 local47 = (Class17) this.aClass232_83.method25835((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class21.method418(this.aClass478_116, arg1, this);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass232_83.method25844(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!nd", name = "ai", descriptor = "(Lclient!nu;IZZ)Lclient!aar;", line = 92)
	Class17 method28647(@OriginalArg(0) Interface51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray461 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray461.length; local10++) {
				if (arg1 == this.anIntArray461[local10]) {
					return (Class17) ((Class10) this.aMap19.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass478_117.method29730(arg1);
		}
		@Pc(47) Class17 local47 = (Class17) this.aClass232_83.method25835((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class21.method418(this.aClass478_116, arg1, this);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass232_83.method25844(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "(B)V", line = 110)
	public void method28648() {
		this.aClass232_83.method25850();
		this.aClass232_82.method25850();
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25850();
		}
	}

	@OriginalMember(owner = "client!nd", name = "ag", descriptor = "()V", line = 110)
	public void method28649() {
		this.aClass232_83.method25850();
		this.aClass232_82.method25850();
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25850();
		}
	}

	@OriginalMember(owner = "client!nd", name = "al", descriptor = "()V", line = 110)
	public void method28650() {
		this.aClass232_83.method25850();
		this.aClass232_82.method25850();
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25850();
		}
	}

	@OriginalMember(owner = "client!nd", name = "au", descriptor = "(I)V", line = 116)
	public void method28651(@OriginalArg(0) int arg0) {
		this.aClass232_83.method25847(arg0);
		this.aClass232_82.method25847(arg0);
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)V", line = 116)
	public void method28652(@OriginalArg(0) int arg0) {
		this.aClass232_83.method25847(arg0);
		this.aClass232_82.method25847(arg0);
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "ao", descriptor = "(I)V", line = 116)
	public void method28653(@OriginalArg(0) int arg0) {
		this.aClass232_83.method25847(arg0);
		this.aClass232_82.method25847(arg0);
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "ax", descriptor = "(I)V", line = 116)
	public void method28654(@OriginalArg(0) int arg0) {
		this.aClass232_83.method25847(arg0);
		this.aClass232_82.method25847(arg0);
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "ar", descriptor = "(I)V", line = 116)
	public void method28655(@OriginalArg(0) int arg0) {
		this.aClass232_83.method25847(arg0);
		this.aClass232_82.method25847(arg0);
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "ak", descriptor = "(I)V", line = 116)
	public void method28656(@OriginalArg(0) int arg0) {
		this.aClass232_83.method25847(arg0);
		this.aClass232_82.method25847(arg0);
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "ad", descriptor = "()V", line = 122)
	public void method28657() {
		this.aClass232_83.method25857();
		this.aClass232_82.method25857();
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25857();
		}
	}

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "(B)V", line = 122)
	public void method28658() {
		this.aClass232_83.method25857();
		this.aClass232_82.method25857();
		if (this.aClass232_84 != null) {
			this.aClass232_84.method25857();
		}
	}

	@OriginalMember(owner = "client!nd", name = "ac", descriptor = "(Lclient!dx;I)[Lclient!cy;", line = 128)
	@Override
	public Class83[] method28618(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass232_84 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass86_11;
		} else {
			if (this.aClass86_11 != arg0) {
				this.aClass232_84.method25850();
			}
			this.aClass86_11 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(33) Class83[] local33 = (Class83[]) this.aClass232_84.method25835((long) arg1);
		if (local33 == null) {
			@Pc(41) Class89[] local41 = Class210.method25596(this.aClass478_117, arg1, 0);
			if (local41 != null && local41.length > 0) {
				local33 = new Class83[local41.length];
				for (@Pc(53) int local53 = 0; local53 < local41.length; local53++) {
					local33[local53] = arg0.method20076(local41[local53], true);
				}
				this.aClass232_84.method25844(local33, (long) arg1);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "(Lclient!dx;II)[Lclient!cy;", line = 128)
	@Override
	public Class83[] method28623(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass232_84 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass86_11;
		} else {
			if (this.aClass86_11 != arg0) {
				this.aClass232_84.method25850();
			}
			this.aClass86_11 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(33) Class83[] local33 = (Class83[]) this.aClass232_84.method25835((long) arg1);
		if (local33 == null) {
			@Pc(41) Class89[] local41 = Class210.method25596(this.aClass478_117, arg1, 0);
			if (local41 != null && local41.length > 0) {
				local33 = new Class83[local41.length];
				for (@Pc(53) int local53 = 0; local53 < local41.length; local53++) {
					local33[local53] = arg0.method20076(local41[local53], true);
				}
				this.aClass232_84.method25844(local33, (long) arg1);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!nd", name = "av", descriptor = "(Lclient!dx;I)[Lclient!cy;", line = 128)
	@Override
	public Class83[] method28621(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass232_84 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass86_11;
		} else {
			if (this.aClass86_11 != arg0) {
				this.aClass232_84.method25850();
			}
			this.aClass86_11 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(33) Class83[] local33 = (Class83[]) this.aClass232_84.method25835((long) arg1);
		if (local33 == null) {
			@Pc(41) Class89[] local41 = Class210.method25596(this.aClass478_117, arg1, 0);
			if (local41 != null && local41.length > 0) {
				local33 = new Class83[local41.length];
				for (@Pc(53) int local53 = 0; local53 < local41.length; local53++) {
					local33[local53] = arg0.method20076(local41[local53], true);
				}
				this.aClass232_84.method25844(local33, (long) arg1);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!nd", name = "at", descriptor = "(Lclient!dx;I)[Lclient!cy;", line = 128)
	@Override
	public Class83[] method28622(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass232_84 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass86_11;
		} else {
			if (this.aClass86_11 != arg0) {
				this.aClass232_84.method25850();
			}
			this.aClass86_11 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(33) Class83[] local33 = (Class83[]) this.aClass232_84.method25835((long) arg1);
		if (local33 == null) {
			@Pc(41) Class89[] local41 = Class210.method25596(this.aClass478_117, arg1, 0);
			if (local41 != null && local41.length > 0) {
				local33 = new Class83[local41.length];
				for (@Pc(53) int local53 = 0; local53 < local41.length; local53++) {
					local33[local53] = arg0.method20076(local41[local53], true);
				}
				this.aClass232_84.method25844(local33, (long) arg1);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(II)I", line = 156)
	@Override
	public int method28619(@OriginalArg(0) int arg0) {
		@Pc(6) Class83[] local6 = this.method28623(this.aClass86_11, arg0);
		return local6 == null ? 0 : local6[0].method18121();
	}

	@OriginalMember(owner = "client!nd", name = "ae", descriptor = "(I)I", line = 156)
	@Override
	public int method28620(@OriginalArg(0) int arg0) {
		@Pc(6) Class83[] local6 = this.method28623(this.aClass86_11, arg0);
		return local6 == null ? 0 : local6[0].method18121();
	}

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "(IILclient!gm;Lclient!gl;IIB)V", line = 578)
	static void method28659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class276 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class73[] local1 = client.aClass73Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class73 local11 = local1[local3];
			if (local11 != null && local11.anInt215 * 652406965 != 0 && client.anInt3414 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt215 * 652406965 == 1) {
					@Pc(39) Class77_Sub6 local39 = (Class77_Sub6) client.aClass12_22.method173((long) (local11.anInt208 * -879249997));
					if (local39 != null) {
						@Pc(45) Class104_Sub1_Sub1_Sub1_Sub1 local45 = (Class104_Sub1_Sub1_Sub1_Sub1) local39.anObject5;
						@Pc(49) Class447 local49 = local45.method24085().aClass447_61;
						local59 = (int) local49.aFloat277 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat278 / 128 - arg1 / 128;
						Class18.method375(arg2, arg3, arg4, arg5, local59, local69, local11.anInt216 * -1562758755, 360000L);
					}
				}
				if (local11.anInt215 * 652406965 == 2) {
					@Pc(98) int local98 = local11.anInt210 * 487170425 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt211 * 631467137 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt214 * -41335265 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class18.method375(arg2, arg3, arg4, arg5, local98, local109, local11.anInt216 * -1562758755, local121);
				}
				if (local11.anInt215 * 652406965 == 10 && local11.anInt208 * -879249997 >= 0 && local11.anInt208 * -879249997 < client.aClass104_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class104_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt208 * -879249997];
					if (local158 != null) {
						@Pc(165) Class447 local165 = local158.method24085().aClass447_61;
						@Pc(175) int local175 = (int) local165.aFloat277 / 128 - arg0 / 128;
						local59 = (int) local165.aFloat278 / 128 - arg1 / 128;
						Class18.method375(arg2, arg3, arg4, arg5, local175, local59, local11.anInt216 * -1562758755, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "sk", descriptor = "(Lclient!yf;I)V", line = 7942)
	static final void method28660(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(25) Class276 local25 = local16.method26633(Class284.aClass86_9);
		if (local25 != null) {
			local18 = local25.anInt3844 * -760407609;
			local20 = local25.anInt3843 * -976807825;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local20;
	}

	@OriginalMember(owner = "client!nd", name = "ww", descriptor = "(Lclient!yf;I)V", line = 8584)
	static final void method28661(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean628 ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "yu", descriptor = "(Lclient!yf;I)V", line = 8904)
	static final void method28662(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class57.method864(local13);
	}
}
