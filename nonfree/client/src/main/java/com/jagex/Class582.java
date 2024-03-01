package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xo")
public class Class582 implements Iterator {

	@OriginalMember(owner = "client!xo", name = "a", descriptor = "Lclient!ps;")
	Class3 aClass3_244;

	@OriginalMember(owner = "client!xo", name = "g", descriptor = "I")
	int anInt5449;

	@OriginalMember(owner = "client!xo", name = "l", descriptor = "Lclient!ps;")
	Class3 aClass3_243 = null;

	@OriginalMember(owner = "client!xo", name = "p", descriptor = "Lclient!xn;")
	Class581 aClass581_41;

	@OriginalMember(owner = "client!xo", name = "<init>", descriptor = "(Lclient!xn;)V", line = 12)
	public Class582(@OriginalArg(0) Class581 arg0) {
		this.aClass581_41 = arg0;
		this.method33245();
	}

	@OriginalMember(owner = "client!xo", name = "s", descriptor = "(I)V", line = 18)
	void method33245() {
		this.aClass3_244 = this.aClass581_41.aClass3Array4[0].aClass3_246;
		this.anInt5449 = 1344217237;
		this.aClass3_243 = null;
	}

	@OriginalMember(owner = "client!xo", name = "c", descriptor = "()V", line = 18)
	void method33250() {
		this.aClass3_244 = this.aClass581_41.aClass3Array4[0].aClass3_246;
		this.anInt5449 = 1344217237;
		this.aClass3_243 = null;
	}

	@OriginalMember(owner = "client!xo", name = "y", descriptor = "()V", line = 18)
	void method33253() {
		this.aClass3_244 = this.aClass581_41.aClass3Array4[0].aClass3_246;
		this.anInt5449 = 1344217237;
		this.aClass3_243 = null;
	}

	@OriginalMember(owner = "client!xo", name = "b", descriptor = "()V", line = 18)
	void method33254() {
		this.aClass3_244 = this.aClass581_41.aClass3Array4[0].aClass3_246;
		this.anInt5449 = 1344217237;
		this.aClass3_243 = null;
	}

	@OriginalMember(owner = "client!xo", name = "z", descriptor = "()Lclient!ps;", line = 24)
	public Class3 method33244() {
		this.method33245();
		return (Class3) this.next();
	}

	@OriginalMember(owner = "client!xo", name = "j", descriptor = "()Lclient!ps;", line = 24)
	public Class3 method33247() {
		this.method33245();
		return (Class3) this.next();
	}

	@OriginalMember(owner = "client!xo", name = "u", descriptor = "(B)Lclient!ps;", line = 24)
	public Class3 method33256() {
		this.method33245();
		return (Class3) this.next();
	}

	@OriginalMember(owner = "client!xo", name = "p", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method33246() {
		@Pc(15) Class3 local15;
		if (this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1] != this.aClass3_244) {
			local15 = this.aClass3_244;
			this.aClass3_244 = local15.aClass3_246;
			this.aClass3_243 = local15;
			return local15;
		}
		do {
			if (this.anInt5449 * -1789220163 >= this.aClass581_41.anInt5448 * 1531898321) {
				return null;
			}
			local15 = this.aClass581_41.aClass3Array4[(this.anInt5449 += 1344217237) * -1789220163 - 1].aClass3_246;
		} while (local15 == this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]);
		this.aClass3_244 = local15.aClass3_246;
		this.aClass3_243 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!xo", name = "next", descriptor = "()Ljava/lang/Object;", line = 29)
	@Override
	public Object next() {
		@Pc(15) Class3 local15;
		if (this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1] != this.aClass3_244) {
			local15 = this.aClass3_244;
			this.aClass3_244 = local15.aClass3_246;
			this.aClass3_243 = local15;
			return local15;
		}
		do {
			if (this.anInt5449 * -1789220163 >= this.aClass581_41.anInt5448 * 1531898321) {
				return null;
			}
			local15 = this.aClass581_41.aClass3Array4[(this.anInt5449 += 1344217237) * -1789220163 - 1].aClass3_246;
		} while (local15 == this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]);
		this.aClass3_244 = local15.aClass3_246;
		this.aClass3_243 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!xo", name = "a", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method33248() {
		@Pc(15) Class3 local15;
		if (this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1] != this.aClass3_244) {
			local15 = this.aClass3_244;
			this.aClass3_244 = local15.aClass3_246;
			this.aClass3_243 = local15;
			return local15;
		}
		do {
			if (this.anInt5449 * -1789220163 >= this.aClass581_41.anInt5448 * 1531898321) {
				return null;
			}
			local15 = this.aClass581_41.aClass3Array4[(this.anInt5449 += 1344217237) * -1789220163 - 1].aClass3_246;
		} while (local15 == this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]);
		this.aClass3_244 = local15.aClass3_246;
		this.aClass3_243 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!xo", name = "g", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method33249() {
		@Pc(15) Class3 local15;
		if (this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1] != this.aClass3_244) {
			local15 = this.aClass3_244;
			this.aClass3_244 = local15.aClass3_246;
			this.aClass3_243 = local15;
			return local15;
		}
		do {
			if (this.anInt5449 * -1789220163 >= this.aClass581_41.anInt5448 * 1531898321) {
				return null;
			}
			local15 = this.aClass581_41.aClass3Array4[(this.anInt5449 += 1344217237) * -1789220163 - 1].aClass3_246;
		} while (local15 == this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]);
		this.aClass3_244 = local15.aClass3_246;
		this.aClass3_243 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!xo", name = "l", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method33255() {
		@Pc(15) Class3 local15;
		if (this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1] != this.aClass3_244) {
			local15 = this.aClass3_244;
			this.aClass3_244 = local15.aClass3_246;
			this.aClass3_243 = local15;
			return local15;
		}
		do {
			if (this.anInt5449 * -1789220163 >= this.aClass581_41.anInt5448 * 1531898321) {
				return null;
			}
			local15 = this.aClass581_41.aClass3Array4[(this.anInt5449 += 1344217237) * -1789220163 - 1].aClass3_246;
		} while (local15 == this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]);
		this.aClass3_244 = local15.aClass3_246;
		this.aClass3_243 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!xo", name = "x", descriptor = "()Z", line = 47)
	public boolean method33252() {
		if (this.aClass3_244 != this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]) {
			return true;
		}
		while (this.anInt5449 * -1789220163 < this.aClass581_41.anInt5448 * 1531898321) {
			if (this.aClass581_41.aClass3Array4[(this.anInt5449 += 1344217237) * -1789220163 - 1].aClass3_246 != this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]) {
				this.aClass3_244 = this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1].aClass3_246;
				return true;
			}
			this.aClass3_244 = this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!xo", name = "hasNext", descriptor = "()Z", line = 47)
	@Override
	public boolean hasNext() {
		if (this.aClass3_244 != this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]) {
			return true;
		}
		while (this.anInt5449 * -1789220163 < this.aClass581_41.anInt5448 * 1531898321) {
			if (this.aClass581_41.aClass3Array4[(this.anInt5449 += 1344217237) * -1789220163 - 1].aClass3_246 != this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1]) {
				this.aClass3_244 = this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1].aClass3_246;
				return true;
			}
			this.aClass3_244 = this.aClass581_41.aClass3Array4[this.anInt5449 * -1789220163 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!xo", name = "remove", descriptor = "()V", line = 61)
	@Override
	public void remove() {
		if (this.aClass3_243 == null) {
			throw new IllegalStateException();
		}
		this.aClass3_243.method33656();
		this.aClass3_243 = null;
	}

	@OriginalMember(owner = "client!xo", name = "h", descriptor = "()V", line = 61)
	public void method33251() {
		if (this.aClass3_243 == null) {
			throw new IllegalStateException();
		}
		this.aClass3_243.method33656();
		this.aClass3_243 = null;
	}

	@OriginalMember(owner = "client!xo", name = "ta", descriptor = "(Lclient!vs;B)V", line = 7552)
	static final void method33257(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(19) Class3_Sub42 local19 = (Class3_Sub42) client.aClass581_22.method33217((long) local13);
		if (local19 != null && local19.anInt2797 * 961996397 == 3) {
			Class490.method29244(local19, true, true);
		}
	}
}
