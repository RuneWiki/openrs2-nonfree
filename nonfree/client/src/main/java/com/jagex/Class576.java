package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xi")
public class Class576 {

	@OriginalMember(owner = "client!xi", name = "p", descriptor = "Ljava/lang/Object;")
	public Object anObject27;

	@OriginalMember(owner = "client!xi", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject26;

	@OriginalMember(owner = "client!xi", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 7)
	public Class576(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject27 = arg0;
		this.anObject26 = arg1;
	}

	@OriginalMember(owner = "client!xi", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
	@Override
	public String toString() {
		return this.anObject27 + ", " + this.anObject26;
	}

	@OriginalMember(owner = "client!xi", name = "ox", descriptor = "()Ljava/lang/String;", line = 13)
	public String method33154() {
		return this.anObject27 + ", " + this.anObject26;
	}

	@OriginalMember(owner = "client!xi", name = "ou", descriptor = "()Ljava/lang/String;", line = 13)
	public String method33155() {
		return this.anObject27 + ", " + this.anObject26;
	}

	@OriginalMember(owner = "client!xi", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class576)) {
			return false;
		}
		@Pc(9) Class576 local9 = (Class576) arg0;
		if (this.anObject27 == null) {
			if (local9.anObject27 != null) {
				return false;
			}
		} else if (!this.anObject27.equals(local9.anObject27)) {
			return false;
		}
		if (this.anObject26 == null) {
			if (local9.anObject26 != null) {
				return false;
			}
		} else if (!this.anObject26.equals(local9.anObject26)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!xi", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method33152(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class576)) {
			return false;
		}
		@Pc(9) Class576 local9 = (Class576) arg0;
		if (this.anObject27 == null) {
			if (local9.anObject27 != null) {
				return false;
			}
		} else if (!this.anObject27.equals(local9.anObject27)) {
			return false;
		}
		if (this.anObject26 == null) {
			if (local9.anObject26 != null) {
				return false;
			}
		} else if (!this.anObject26.equals(local9.anObject26)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!xi", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method33156(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class576)) {
			return false;
		}
		@Pc(9) Class576 local9 = (Class576) arg0;
		if (this.anObject27 == null) {
			if (local9.anObject27 != null) {
				return false;
			}
		} else if (!this.anObject27.equals(local9.anObject27)) {
			return false;
		}
		if (this.anObject26 == null) {
			if (local9.anObject26 != null) {
				return false;
			}
		} else if (!this.anObject26.equals(local9.anObject26)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!xi", name = "hashCode", descriptor = "()I", line = 33)
	@Override
	public int hashCode() {
		@Pc(1) int local1 = 0;
		if (this.anObject27 != null) {
			local1 += this.anObject27.hashCode();
		}
		if (this.anObject26 != null) {
			local1 += this.anObject26.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xi", name = "oy", descriptor = "()I", line = 33)
	public int method33153() {
		@Pc(1) int local1 = 0;
		if (this.anObject27 != null) {
			local1 += this.anObject27.hashCode();
		}
		if (this.anObject26 != null) {
			local1 += this.anObject26.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xi", name = "ol", descriptor = "()I", line = 33)
	public int method33157() {
		@Pc(1) int local1 = 0;
		if (this.anObject27 != null) {
			local1 += this.anObject27.hashCode();
		}
		if (this.anObject26 != null) {
			local1 += this.anObject26.hashCode() * 31;
		}
		return local1;
	}
}
