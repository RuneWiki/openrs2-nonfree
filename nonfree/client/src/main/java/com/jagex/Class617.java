package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zd")
public final class Class617 {

	@OriginalMember(owner = "client!zd", name = "p", descriptor = "I")
	int anInt5553;

	@OriginalMember(owner = "client!zd", name = "g", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	ReferenceQueue aReferenceQueue1 = new ReferenceQueue();

	@OriginalMember(owner = "client!zd", name = "a", descriptor = "[Lclient!ann;")
	WeakReference_Sub1[] aWeakReference_Sub1Array1 = new WeakReference_Sub1[16];

	@OriginalMember(owner = "client!zd", name = "p", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)V", line = 16)
	public void method33696(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method33700();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			this.aWeakReference_Sub1Array1[local19] = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
			this.anInt5553 += -301654995;
			if (this.anInt5553 * 2130940837 >= this.aWeakReference_Sub1Array1.length) {
				this.method33695();
			}
			return;
		}
		while (local24.get() != arg0) {
			if (local24.aWeakReference_Sub1_1 == null) {
				local24.aWeakReference_Sub1_1 = new WeakReference_Sub1(arg0, this.aReferenceQueue1, local11, arg1);
				this.anInt5553 += -301654995;
				if (this.anInt5553 * 2130940837 >= this.aWeakReference_Sub1Array1.length) {
					this.method33695();
				}
				break;
			}
			local24 = local24.aWeakReference_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!zd", name = "x", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method33701(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method33700();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt5553 -= -301654995;
			return;
		}
		while (true) {
			@Pc(48) WeakReference_Sub1 local48 = local24.aWeakReference_Sub1_1;
			if (local48 == null) {
				break;
			}
			if (local48.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local48.aWeakReference_Sub1_1;
				this.anInt5553 -= -301654995;
				break;
			}
			local24 = local48;
		}
	}

	@OriginalMember(owner = "client!zd", name = "s", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method33702(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method33700();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt5553 -= -301654995;
			return;
		}
		while (true) {
			@Pc(48) WeakReference_Sub1 local48 = local24.aWeakReference_Sub1_1;
			if (local48 == null) {
				break;
			}
			if (local48.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local48.aWeakReference_Sub1_1;
				this.anInt5553 -= -301654995;
				break;
			}
			local24 = local48;
		}
	}

	@OriginalMember(owner = "client!zd", name = "a", descriptor = "(Ljava/lang/Object;I)V", line = 41)
	public void method33703(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method33700();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt5553 -= -301654995;
			return;
		}
		while (true) {
			@Pc(48) WeakReference_Sub1 local48 = local24.aWeakReference_Sub1_1;
			if (local48 == null) {
				break;
			}
			if (local48.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local48.aWeakReference_Sub1_1;
				this.anInt5553 -= -301654995;
				break;
			}
			local24 = local48;
		}
	}

	@OriginalMember(owner = "client!zd", name = "y", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method33704(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method33700();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt5553 -= -301654995;
			return;
		}
		while (true) {
			@Pc(48) WeakReference_Sub1 local48 = local24.aWeakReference_Sub1_1;
			if (local48 == null) {
				break;
			}
			if (local48.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local48.aWeakReference_Sub1_1;
				this.anInt5553 -= -301654995;
				break;
			}
			local24 = local48;
		}
	}

	@OriginalMember(owner = "client!zd", name = "u", descriptor = "(Ljava/lang/Object;)V", line = 41)
	public void method33708(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.method33700();
		@Pc(11) int local11 = System.identityHashCode(arg0);
		@Pc(19) int local19 = local11 & this.aWeakReference_Sub1Array1.length - 1;
		@Pc(24) WeakReference_Sub1 local24 = this.aWeakReference_Sub1Array1[local19];
		if (local24 == null) {
			return;
		}
		if (local24.get() == arg0) {
			this.aWeakReference_Sub1Array1[local19] = local24.aWeakReference_Sub1_1;
			this.anInt5553 -= -301654995;
			return;
		}
		while (true) {
			@Pc(48) WeakReference_Sub1 local48 = local24.aWeakReference_Sub1_1;
			if (local48 == null) {
				break;
			}
			if (local48.get() == arg0) {
				local24.aWeakReference_Sub1_1 = local48.aWeakReference_Sub1_1;
				this.anInt5553 -= -301654995;
				break;
			}
			local24 = local48;
		}
	}

	@OriginalMember(owner = "client!zd", name = "c", descriptor = "()Ljava/util/ArrayList;", line = 64)
	public ArrayList method33697() {
		this.method33700();
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt5553 * 2130940837);
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

	@OriginalMember(owner = "client!zd", name = "g", descriptor = "(B)Ljava/util/ArrayList;", line = 64)
	public ArrayList method33698() {
		this.method33700();
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt5553 * 2130940837);
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

	@OriginalMember(owner = "client!zd", name = "b", descriptor = "()Ljava/util/ArrayList;", line = 64)
	public ArrayList method33705() {
		this.method33700();
		@Pc(10) ArrayList local10 = new ArrayList(this.anInt5553 * 2130940837);
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

	@OriginalMember(owner = "client!zd", name = "l", descriptor = "(I)V", line = 83)
	void method33695() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt2778 * -449574463 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!zd", name = "j", descriptor = "()V", line = 83)
	void method33699() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt2778 * -449574463 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!zd", name = "z", descriptor = "()V", line = 83)
	void method33706() {
		@Pc(2) WeakReference_Sub1[] local2 = this.aWeakReference_Sub1Array1;
		this.aWeakReference_Sub1Array1 = new WeakReference_Sub1[local2.length * 2];
		@Pc(11) WeakReference_Sub1[] local11 = local2;
		@Pc(26) WeakReference_Sub1 local26;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			for (@Pc(21) WeakReference_Sub1 local21 = local11[local13]; local21 != null; local21 = local26) {
				local26 = local21.aWeakReference_Sub1_1;
				@Pc(37) int local37 = local21.anInt2778 * -449574463 & this.aWeakReference_Sub1Array1.length - 1;
				local21.aWeakReference_Sub1_1 = this.aWeakReference_Sub1Array1[local37];
				this.aWeakReference_Sub1Array1[local37] = local21;
			}
		}
	}

	@OriginalMember(owner = "client!zd", name = "h", descriptor = "(I)V", line = 104)
	void method33700() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(18) int local18 = local4.anInt2778 * -449574463 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(23) WeakReference_Sub1 local23 = this.aWeakReference_Sub1Array1[local18];
			if (local4 == local23) {
				this.aWeakReference_Sub1Array1[local18] = local4.aWeakReference_Sub1_1;
				this.anInt5553 -= -301654995;
			} else {
				while (local23 != null && local4 != local23.aWeakReference_Sub1_1) {
					local23 = local23.aWeakReference_Sub1_1;
				}
				if (local23 != null) {
					local23.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt5553 -= -301654995;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zd", name = "n", descriptor = "()V", line = 104)
	void method33707() {
		while (true) {
			@Pc(4) WeakReference_Sub1 local4 = (WeakReference_Sub1) this.aReferenceQueue1.poll();
			if (local4 == null) {
				return;
			}
			@Pc(18) int local18 = local4.anInt2778 * -449574463 & this.aWeakReference_Sub1Array1.length - 1;
			@Pc(23) WeakReference_Sub1 local23 = this.aWeakReference_Sub1Array1[local18];
			if (local4 == local23) {
				this.aWeakReference_Sub1Array1[local18] = local4.aWeakReference_Sub1_1;
				this.anInt5553 -= -301654995;
			} else {
				while (local23 != null && local4 != local23.aWeakReference_Sub1_1) {
					local23 = local23.aWeakReference_Sub1_1;
				}
				if (local23 != null) {
					local23.aWeakReference_Sub1_1 = local4.aWeakReference_Sub1_1;
					this.anInt5553 -= -301654995;
				}
			}
		}
	}
}
