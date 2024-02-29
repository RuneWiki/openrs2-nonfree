package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aak")
public final class Class12 implements Iterable {

	@OriginalMember(owner = "client!aak", name = "v", descriptor = "J")
	long aLong3;

	@OriginalMember(owner = "client!aak", name = "y", descriptor = "Lclient!sn;")
	Class77 aClass77_1;

	@OriginalMember(owner = "client!aak", name = "l", descriptor = "Lclient!sn;")
	Class77 aClass77_2;

	@OriginalMember(owner = "client!aak", name = "w", descriptor = "I")
	int anInt38 = 0;

	@OriginalMember(owner = "client!aak", name = "p", descriptor = "I")
	int anInt37;

	@OriginalMember(owner = "client!aak", name = "c", descriptor = "[Lclient!sn;")
	Class77[] aClass77Array1;

	@OriginalMember(owner = "client!aak", name = "<init>", descriptor = "(I)V", line = 14)
	public Class12(@OriginalArg(0) int arg0) {
		this.anInt37 = arg0 * 1384503765;
		this.aClass77Array1 = new Class77[arg0];
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(27) Class77 local27 = this.aClass77Array1[local15] = new Class77();
			local27.aClass77_222 = local27;
			local27.aClass77_221 = local27;
		}
	}

	@OriginalMember(owner = "client!aak", name = "p", descriptor = "(J)Lclient!sn;", line = 25)
	public Class77 method173(@OriginalArg(0) long arg0) {
		this.aLong3 = arg0 * -8092187468332480431L;
		@Pc(18) Class77 local18 = this.aClass77Array1[(int) (arg0 & (long) (this.anInt37 * -393701507 - 1))];
		for (this.aClass77_2 = local18.aClass77_222; this.aClass77_2 != local18; this.aClass77_2 = this.aClass77_2.aClass77_222) {
			if (this.aClass77_2.aLong229 * 8258869577519436579L == arg0) {
				@Pc(37) Class77 local37 = this.aClass77_2;
				this.aClass77_2 = this.aClass77_2.aClass77_222;
				return local37;
			}
		}
		this.aClass77_2 = null;
		return null;
	}

	@OriginalMember(owner = "client!aak", name = "x", descriptor = "(J)Lclient!sn;", line = 25)
	public Class77 method174(@OriginalArg(0) long arg0) {
		this.aLong3 = arg0 * -8092187468332480431L;
		@Pc(18) Class77 local18 = this.aClass77Array1[(int) (arg0 & (long) (this.anInt37 * -393701507 - 1))];
		for (this.aClass77_2 = local18.aClass77_222; this.aClass77_2 != local18; this.aClass77_2 = this.aClass77_2.aClass77_222) {
			if (this.aClass77_2.aLong229 * 8258869577519436579L == arg0) {
				@Pc(37) Class77 local37 = this.aClass77_2;
				this.aClass77_2 = this.aClass77_2.aClass77_222;
				return local37;
			}
		}
		this.aClass77_2 = null;
		return null;
	}

	@OriginalMember(owner = "client!aak", name = "d", descriptor = "(J)Lclient!sn;", line = 25)
	public Class77 method175(@OriginalArg(0) long arg0) {
		this.aLong3 = arg0 * -8092187468332480431L;
		@Pc(18) Class77 local18 = this.aClass77Array1[(int) (arg0 & (long) (this.anInt37 * -393701507 - 1))];
		for (this.aClass77_2 = local18.aClass77_222; this.aClass77_2 != local18; this.aClass77_2 = this.aClass77_2.aClass77_222) {
			if (this.aClass77_2.aLong229 * 8258869577519436579L == arg0) {
				@Pc(37) Class77 local37 = this.aClass77_2;
				this.aClass77_2 = this.aClass77_2.aClass77_222;
				return local37;
			}
		}
		this.aClass77_2 = null;
		return null;
	}

	@OriginalMember(owner = "client!aak", name = "c", descriptor = "(I)Lclient!sn;", line = 41)
	public Class77 method176() {
		if (this.aClass77_2 == null) {
			return null;
		}
		@Pc(21) Class77 local21 = this.aClass77Array1[(int) (this.aLong3 * 3173543863542448305L & (long) (this.anInt37 * -393701507 - 1))];
		while (this.aClass77_2 != local21) {
			if (this.aLong3 * 3173543863542448305L == this.aClass77_2.aLong229 * 8258869577519436579L) {
				@Pc(39) Class77 local39 = this.aClass77_2;
				this.aClass77_2 = this.aClass77_2.aClass77_222;
				return local39;
			}
			this.aClass77_2 = this.aClass77_2.aClass77_222;
		}
		this.aClass77_2 = null;
		return null;
	}

	@OriginalMember(owner = "client!aak", name = "z", descriptor = "()Lclient!sn;", line = 41)
	public Class77 method177() {
		if (this.aClass77_2 == null) {
			return null;
		}
		@Pc(21) Class77 local21 = this.aClass77Array1[(int) (this.aLong3 * 3173543863542448305L & (long) (this.anInt37 * -393701507 - 1))];
		while (this.aClass77_2 != local21) {
			if (this.aLong3 * 3173543863542448305L == this.aClass77_2.aLong229 * 8258869577519436579L) {
				@Pc(39) Class77 local39 = this.aClass77_2;
				this.aClass77_2 = this.aClass77_2.aClass77_222;
				return local39;
			}
			this.aClass77_2 = this.aClass77_2.aClass77_222;
		}
		this.aClass77_2 = null;
		return null;
	}

	@OriginalMember(owner = "client!aak", name = "j", descriptor = "()Lclient!sn;", line = 41)
	public Class77 method178() {
		if (this.aClass77_2 == null) {
			return null;
		}
		@Pc(21) Class77 local21 = this.aClass77Array1[(int) (this.aLong3 * 3173543863542448305L & (long) (this.anInt37 * -393701507 - 1))];
		while (this.aClass77_2 != local21) {
			if (this.aLong3 * 3173543863542448305L == this.aClass77_2.aLong229 * 8258869577519436579L) {
				@Pc(39) Class77 local39 = this.aClass77_2;
				this.aClass77_2 = this.aClass77_2.aClass77_222;
				return local39;
			}
			this.aClass77_2 = this.aClass77_2.aClass77_222;
		}
		this.aClass77_2 = null;
		return null;
	}

	@OriginalMember(owner = "client!aak", name = "g", descriptor = "()Lclient!sn;", line = 41)
	public Class77 method179() {
		if (this.aClass77_2 == null) {
			return null;
		}
		@Pc(21) Class77 local21 = this.aClass77Array1[(int) (this.aLong3 * 3173543863542448305L & (long) (this.anInt37 * -393701507 - 1))];
		while (this.aClass77_2 != local21) {
			if (this.aLong3 * 3173543863542448305L == this.aClass77_2.aLong229 * 8258869577519436579L) {
				@Pc(39) Class77 local39 = this.aClass77_2;
				this.aClass77_2 = this.aClass77_2.aClass77_222;
				return local39;
			}
			this.aClass77_2 = this.aClass77_2.aClass77_222;
		}
		this.aClass77_2 = null;
		return null;
	}

	@OriginalMember(owner = "client!aak", name = "v", descriptor = "([Lclient!sn;B)I", line = 56)
	public int method180(@OriginalArg(0) Class77[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt37 * -393701507; local3++) {
			@Pc(14) Class77 local14 = this.aClass77Array1[local3];
			for (@Pc(17) Class77 local17 = local14.aClass77_222; local17 != local14; local17 = local17.aClass77_222) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aak", name = "i", descriptor = "([Lclient!sn;)I", line = 56)
	public int method181(@OriginalArg(0) Class77[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt37 * -393701507; local3++) {
			@Pc(14) Class77 local14 = this.aClass77Array1[local3];
			for (@Pc(17) Class77 local17 = local14.aClass77_222; local17 != local14; local17 = local17.aClass77_222) {
				arg0[local1++] = local17;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aak", name = "k", descriptor = "()I", line = 69)
	public int method182() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt37 * -393701507; local3++) {
			@Pc(14) Class77 local14 = this.aClass77Array1[local3];
			for (@Pc(17) Class77 local17 = local14.aClass77_222; local17 != local14; local17 = local17.aClass77_222) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aak", name = "l", descriptor = "(I)I", line = 69)
	public int method183() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt37 * -393701507; local3++) {
			@Pc(14) Class77 local14 = this.aClass77Array1[local3];
			for (@Pc(17) Class77 local17 = local14.aClass77_222; local17 != local14; local17 = local17.aClass77_222) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aak", name = "y", descriptor = "(Lclient!sn;J)V", line = 82)
	public void method184(@OriginalArg(0) Class77 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		@Pc(20) Class77 local20 = this.aClass77Array1[(int) (arg1 & (long) (this.anInt37 * -393701507 - 1))];
		arg0.aClass77_221 = local20.aClass77_221;
		arg0.aClass77_222 = local20;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
		arg0.aLong229 = arg1 * 936217890172187787L;
	}

	@OriginalMember(owner = "client!aak", name = "u", descriptor = "(Lclient!sn;J)V", line = 82)
	public void method185(@OriginalArg(0) Class77 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		@Pc(20) Class77 local20 = this.aClass77Array1[(int) (arg1 & (long) (this.anInt37 * -393701507 - 1))];
		arg0.aClass77_221 = local20.aClass77_221;
		arg0.aClass77_222 = local20;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
		arg0.aLong229 = arg1 * 936217890172187787L;
	}

	@OriginalMember(owner = "client!aak", name = "e", descriptor = "(Lclient!sn;J)V", line = 82)
	public void method186(@OriginalArg(0) Class77 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass77_221 != null) {
			arg0.method24063();
		}
		@Pc(20) Class77 local20 = this.aClass77Array1[(int) (arg1 & (long) (this.anInt37 * -393701507 - 1))];
		arg0.aClass77_221 = local20.aClass77_221;
		arg0.aClass77_222 = local20;
		arg0.aClass77_221.aClass77_222 = arg0;
		arg0.aClass77_222.aClass77_221 = arg0;
		arg0.aLong229 = arg1 * 936217890172187787L;
	}

	@OriginalMember(owner = "client!aak", name = "f", descriptor = "()V", line = 92)
	public void method187() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt37 * -393701507; local1++) {
			@Pc(12) Class77 local12 = this.aClass77Array1[local1];
			while (true) {
				@Pc(15) Class77 local15 = local12.aClass77_222;
				if (local15 == local12) {
					break;
				}
				local15.method24063();
			}
		}
		this.aClass77_2 = null;
		this.aClass77_1 = null;
	}

	@OriginalMember(owner = "client!aak", name = "w", descriptor = "(B)V", line = 92)
	public void method188() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt37 * -393701507; local1++) {
			@Pc(12) Class77 local12 = this.aClass77Array1[local1];
			while (true) {
				@Pc(15) Class77 local15 = local12.aClass77_222;
				if (local15 == local12) {
					break;
				}
				local15.method24063();
			}
		}
		this.aClass77_2 = null;
		this.aClass77_1 = null;
	}

	@OriginalMember(owner = "client!aak", name = "o", descriptor = "()V", line = 92)
	public void method189() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt37 * -393701507; local1++) {
			@Pc(12) Class77 local12 = this.aClass77Array1[local1];
			while (true) {
				@Pc(15) Class77 local15 = local12.aClass77_222;
				if (local15 == local12) {
					break;
				}
				local15.method24063();
			}
		}
		this.aClass77_2 = null;
		this.aClass77_1 = null;
	}

	@OriginalMember(owner = "client!aak", name = "t", descriptor = "(I)Lclient!sn;", line = 105)
	public Class77 method190() {
		this.anInt38 = 0;
		return this.method192();
	}

	@OriginalMember(owner = "client!aak", name = "b", descriptor = "()Lclient!sn;", line = 105)
	public Class77 method191() {
		this.anInt38 = 0;
		return this.method192();
	}

	@OriginalMember(owner = "client!aak", name = "q", descriptor = "(B)Lclient!sn;", line = 110)
	public Class77 method192() {
		@Pc(19) Class77 local19;
		if (this.anInt38 * -830469435 > 0 && this.aClass77_1 != this.aClass77Array1[this.anInt38 * -830469435 - 1]) {
			local19 = this.aClass77_1;
			this.aClass77_1 = local19.aClass77_222;
			return local19;
		}
		do {
			if (this.anInt38 * -830469435 >= this.anInt37 * -393701507) {
				return null;
			}
			local19 = this.aClass77Array1[(this.anInt38 += -792140787) * -830469435 - 1].aClass77_222;
		} while (this.aClass77Array1[this.anInt38 * -830469435 - 1] == local19);
		this.aClass77_1 = local19.aClass77_222;
		return local19;
	}

	@OriginalMember(owner = "client!aak", name = "n", descriptor = "()Lclient!sn;", line = 110)
	public Class77 method193() {
		@Pc(19) Class77 local19;
		if (this.anInt38 * -830469435 > 0 && this.aClass77_1 != this.aClass77Array1[this.anInt38 * -830469435 - 1]) {
			local19 = this.aClass77_1;
			this.aClass77_1 = local19.aClass77_222;
			return local19;
		}
		do {
			if (this.anInt38 * -830469435 >= this.anInt37 * -393701507) {
				return null;
			}
			local19 = this.aClass77Array1[(this.anInt38 += -792140787) * -830469435 - 1].aClass77_222;
		} while (this.aClass77Array1[this.anInt38 * -830469435 - 1] == local19);
		this.aClass77_1 = local19.aClass77_222;
		return local19;
	}

	@OriginalMember(owner = "client!aak", name = "a", descriptor = "()Lclient!sn;", line = 110)
	public Class77 method194() {
		@Pc(19) Class77 local19;
		if (this.anInt38 * -830469435 > 0 && this.aClass77_1 != this.aClass77Array1[this.anInt38 * -830469435 - 1]) {
			local19 = this.aClass77_1;
			this.aClass77_1 = local19.aClass77_222;
			return local19;
		}
		do {
			if (this.anInt38 * -830469435 >= this.anInt37 * -393701507) {
				return null;
			}
			local19 = this.aClass77Array1[(this.anInt38 += -792140787) * -830469435 - 1].aClass77_222;
		} while (this.aClass77Array1[this.anInt38 * -830469435 - 1] == local19);
		this.aClass77_1 = local19.aClass77_222;
		return local19;
	}

	@OriginalMember(owner = "client!aak", name = "m", descriptor = "()Lclient!sn;", line = 110)
	public Class77 method195() {
		@Pc(19) Class77 local19;
		if (this.anInt38 * -830469435 > 0 && this.aClass77_1 != this.aClass77Array1[this.anInt38 * -830469435 - 1]) {
			local19 = this.aClass77_1;
			this.aClass77_1 = local19.aClass77_222;
			return local19;
		}
		do {
			if (this.anInt38 * -830469435 >= this.anInt37 * -393701507) {
				return null;
			}
			local19 = this.aClass77Array1[(this.anInt38 += -792140787) * -830469435 - 1].aClass77_222;
		} while (this.aClass77Array1[this.anInt38 * -830469435 - 1] == local19);
		this.aClass77_1 = local19.aClass77_222;
		return local19;
	}

	@OriginalMember(owner = "client!aak", name = "d", descriptor = "(IIIZIZB)V", line = 115)
	static void method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg0) / 2;
		@Pc(10) int local10 = arg0;
		@Pc(14) Class145_Sub1 local14 = Class8.aClass145_Sub1Array1[local8];
		Class8.aClass145_Sub1Array1[local8] = Class8.aClass145_Sub1Array1[arg1];
		Class8.aClass145_Sub1Array1[arg1] = local14;
		for (@Pc(26) int local26 = arg0; local26 < arg1; local26++) {
			if (Class14.method17031(Class8.aClass145_Sub1Array1[local26], local14, arg2, arg3, arg4, arg5) <= 0) {
				@Pc(44) Class145_Sub1 local44 = Class8.aClass145_Sub1Array1[local26];
				Class8.aClass145_Sub1Array1[local26] = Class8.aClass145_Sub1Array1[local10];
				Class8.aClass145_Sub1Array1[local10++] = local44;
			}
		}
		Class8.aClass145_Sub1Array1[arg1] = Class8.aClass145_Sub1Array1[local10];
		Class8.aClass145_Sub1Array1[local10] = local14;
		method196(arg0, local10 - 1, arg2, arg3, arg4, arg5);
		method196(local10 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aak", name = "s", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method197() {
		return new Class19(this);
	}

	@OriginalMember(owner = "client!aak", name = "r", descriptor = "()Ljava/util/Iterator;", line = 126)
	public Iterator method198() {
		return new Class19(this);
	}

	@OriginalMember(owner = "client!aak", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 126)
	@Override
	public Iterator iterator() {
		return new Class19(this);
	}
}
