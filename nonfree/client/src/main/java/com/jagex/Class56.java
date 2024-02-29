package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acg")
public final class Class56 {

	@OriginalMember(owner = "client!acg", name = "qh", descriptor = "I")
	static int anInt189;

	@OriginalMember(owner = "client!acg", name = "so", descriptor = "Lclient!aes;")
	public static Class93_Sub1 aClass93_Sub1_1;

	@OriginalMember(owner = "client!acg", name = "uo", descriptor = "I")
	static int anInt190;

	@OriginalMember(owner = "client!acg", name = "p", descriptor = "I")
	int anInt188;

	@OriginalMember(owner = "client!acg", name = "v", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	ReferenceQueue aReferenceQueue1 = new ReferenceQueue();

	@OriginalMember(owner = "client!acg", name = "c", descriptor = "[Lclient!asu;")
	WeakReference_Sub1[] aWeakReference_Sub1Array1 = new WeakReference_Sub1[16];

	@OriginalMember(owner = "client!acg", name = "p", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)V", line = 16)
	public void method833(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			this.aWeakReference_Sub1Array1[local19] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
			this.anInt188 += 346731323;
			if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
				this.method851();
			}
			return;
		}
		while (local24.get() != arg0) {
			if (local24.aWeakReference_Sub1_1 == null) {
				local24.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
				this.anInt188 += 346731323;
				if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
					this.method851();
				}
				break;
			}
			local24 = local24.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!acg", name = "d", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 16)
	public void method834(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			this.aWeakReference_Sub1Array1[local19] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
			this.anInt188 += 346731323;
			if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
				this.method851();
			}
			return;
		}
		while (local24.get() != arg0) {
			if (local24.aWeakReference_Sub1_1 == null) {
				local24.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
				this.anInt188 += 346731323;
				if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
					this.method851();
				}
				break;
			}
			local24 = local24.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!acg", name = "w", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 16)
	public void method835(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			this.aWeakReference_Sub1Array1[local19] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
			this.anInt188 += 346731323;
			if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
				this.method851();
			}
			return;
		}
		while (local24.get() != arg0) {
			if (local24.aWeakReference_Sub1_1 == null) {
				local24.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
				this.anInt188 += 346731323;
				if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
					this.method851();
				}
				break;
			}
			local24 = local24.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!acg", name = "q", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 16)
	public void method836(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			this.aWeakReference_Sub1Array1[local19] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
			this.anInt188 += 346731323;
			if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
				this.method851();
			}
			return;
		}
		while (local24.get() != arg0) {
			if (local24.aWeakReference_Sub1_1 == null) {
				local24.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
				this.anInt188 += 346731323;
				if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
					this.method851();
				}
				break;
			}
			local24 = local24.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!acg", name = "x", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 16)
	public void method837(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			this.aWeakReference_Sub1Array1[local19] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
			this.anInt188 += 346731323;
			if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
				this.method851();
			}
			return;
		}
		while (local24.get() != arg0) {
			if (local24.aWeakReference_Sub1_1 == null) {
				local24.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
				this.anInt188 += 346731323;
				if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
					this.method851();
				}
				break;
			}
			local24 = local24.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!acg", name = "t", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 16)
	public void method838(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			this.aWeakReference_Sub1Array1[local19] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
			this.anInt188 += 346731323;
			if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
				this.method851();
			}
			return;
		}
		while (local24.get() != arg0) {
			if (local24.aWeakReference_Sub1_1 == null) {
				local24.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
				this.anInt188 += 346731323;
				if (this.anInt188 * 620473843 >= this.aWeakReference_Sub1Array1.length) {
					this.method851();
				}
				break;
			}
			local24 = local24.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!acg", name = "i", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method839(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt188 -= 346731323;
			return;
		}
		while (true) {
			@Pc(47) WeakReference_Sub1 local47 = local24.aWeakReference_Sub1_1;
			if (local47 == null) {
				break;
			}
			if (local47.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local47.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
				break;
			}
			local24 = local47;
		}
	}

	@OriginalMember(owner = "client!acg", name = "r", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method840(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt188 -= 346731323;
			return;
		}
		while (true) {
			@Pc(47) WeakReference_Sub1 local47 = local24.aWeakReference_Sub1_1;
			if (local47 == null) {
				break;
			}
			if (local47.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local47.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
				break;
			}
			local24 = local47;
		}
	}

	@OriginalMember(owner = "client!acg", name = "c", descriptor = "(Ljava/lang/Object;B)V", line = 41)
	public void method841(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt188 -= 346731323;
			return;
		}
		while (true) {
			@Pc(47) WeakReference_Sub1 local47 = local24.aWeakReference_Sub1_1;
			if (local47 == null) {
				break;
			}
			if (local47.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local47.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
				break;
			}
			local24 = local47;
		}
	}

	@OriginalMember(owner = "client!acg", name = "g", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method842(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt188 -= 346731323;
			return;
		}
		while (true) {
			@Pc(47) WeakReference_Sub1 local47 = local24.aWeakReference_Sub1_1;
			if (local47 == null) {
				break;
			}
			if (local47.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local47.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
				break;
			}
			local24 = local47;
		}
	}

	@OriginalMember(owner = "client!acg", name = "s", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method843(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt188 -= 346731323;
			return;
		}
		while (true) {
			@Pc(47) WeakReference_Sub1 local47 = local24.aWeakReference_Sub1_1;
			if (local47 == null) {
				break;
			}
			if (local47.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local47.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
				break;
			}
			local24 = local47;
		}
	}

	@OriginalMember(owner = "client!acg", name = "j", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method844(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt188 -= 346731323;
			return;
		}
		while (true) {
			@Pc(47) WeakReference_Sub1 local47 = local24.aWeakReference_Sub1_1;
			if (local47 == null) {
				break;
			}
			if (local47.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local47.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
				break;
			}
			local24 = local47;
		}
	}

	@OriginalMember(owner = "client!acg", name = "z", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method845(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method854();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt188 -= 346731323;
			return;
		}
		while (true) {
			@Pc(47) WeakReference_Sub1 local47 = local24.aWeakReference_Sub1_1;
			if (local47 == null) {
				break;
			}
			if (local47.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local47.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
				break;
			}
			local24 = local47;
		}
	}

	@OriginalMember(owner = "client!acg", name = "v", descriptor = "(I)Ljava/util/ArrayList;", line = 64)
	public ArrayList method846() {
		this.method854();
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt188 * 620473843);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(29) Object local29 = local23.get();
				if (local29 != null) {
					local10.add(local29);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!acg", name = "k", descriptor = "()Ljava/util/ArrayList;", line = 64)
	public ArrayList method847() {
		this.method854();
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt188 * 620473843);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(29) Object local29 = local23.get();
				if (local29 != null) {
					local10.add(local29);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!acg", name = "u", descriptor = "()Ljava/util/ArrayList;", line = 64)
	public ArrayList method848() {
		this.method854();
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt188 * 620473843);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(29) Object local29 = local23.get();
				if (local29 != null) {
					local10.add(local29);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!acg", name = "e", descriptor = "()Ljava/util/ArrayList;", line = 64)
	public ArrayList method849() {
		this.method854();
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt188 * 620473843);
		@Pc(13) WeakReference_Sub1[] local13 = this.aWeakReference_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			for (@Pc(23) WeakReference_Sub1 local23 = local13[local15]; local23 != null; local23 = local23.aWeakReference_Sub1_1) {
				@Pc(29) Object local29 = local23.get();
				if (local29 != null) {
					local10.add(local29);
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!acg", name = "o", descriptor = "()V", line = 83)
	void method850() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3165 * -1436277177 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!acg", name = "l", descriptor = "(B)V", line = 83)
	void method851() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3165 * -1436277177 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!acg", name = "f", descriptor = "()V", line = 83)
	void method852() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3165 * -1436277177 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!acg", name = "b", descriptor = "()V", line = 83)
	void method853() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt3165 * -1436277177 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!acg", name = "y", descriptor = "(I)V", line = 104)
	void method854() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(18) int local18 = local4.anInt3165 * -1436277177 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(23) WeakReference_Sub1 local23 = this.aWeakReference_Sub1Array1[local18];
			if (local23 == local4) {
				this.aWeakReference_Sub1Array1[local18] = local4.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
			} else {
				while (local23 != null && local4 != local23.aWeakReference_Sub1_1) {
					local23 = local23.aWeakReference_Sub1_1;
				}
				if (local23 != null) {
					local23.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt188 -= 346731323;
				}
			}
		}
	}

	@OriginalMember(owner = "client!acg", name = "n", descriptor = "()V", line = 104)
	void method855() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(18) int local18 = local4.anInt3165 * -1436277177 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(23) WeakReference_Sub1 local23 = this.aWeakReference_Sub1Array1[local18];
			if (local23 == local4) {
				this.aWeakReference_Sub1Array1[local18] = local4.aWeakReference_Sub1_1;
				this.anInt188 -= 346731323;
			} else {
				while (local23 != null && local4 != local23.aWeakReference_Sub1_1) {
					local23 = local23.aWeakReference_Sub1_1;
				}
				if (local23 != null) {
					local23.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt188 -= 346731323;
				}
			}
		}
	}
}
