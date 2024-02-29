package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aai")
public class Class10 {

	@OriginalMember(owner = "client!aai", name = "p", descriptor = "Ljava/lang/Object;")
	public Object anObject1;

	@OriginalMember(owner = "client!aai", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject2;

	@OriginalMember(owner = "client!aai", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 7)
	public Class10(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject1 = arg0;
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!aai", name = "rs", descriptor = "()Ljava/lang/String;", line = 13)
	public String method152() {
		return this.anObject1 + ", " + this.anObject2;
	}

	@OriginalMember(owner = "client!aai", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
	@Override
	public String toString() {
		return this.anObject1 + ", " + this.anObject2;
	}

	@OriginalMember(owner = "client!aai", name = "ro", descriptor = "()Ljava/lang/String;", line = 13)
	public String method153() {
		return this.anObject1 + ", " + this.anObject2;
	}

	@OriginalMember(owner = "client!aai", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method154(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class10)) {
			return false;
		}
		@Pc(9) Class10 local9 = (Class10) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aai", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method155(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class10)) {
			return false;
		}
		@Pc(9) Class10 local9 = (Class10) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aai", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class10)) {
			return false;
		}
		@Pc(9) Class10 local9 = (Class10) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aai", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method156(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class10)) {
			return false;
		}
		@Pc(9) Class10 local9 = (Class10) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aai", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method157(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class10)) {
			return false;
		}
		@Pc(9) Class10 local9 = (Class10) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aai", name = "hashCode", descriptor = "()I", line = 33)
	@Override
	public int hashCode() {
		@Pc(1) int local1 = 0;
		if (this.anObject1 != null) {
			local1 += this.anObject1.hashCode();
		}
		if (this.anObject2 != null) {
			local1 += this.anObject2.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aai", name = "rr", descriptor = "()I", line = 33)
	public int method158() {
		@Pc(1) int local1 = 0;
		if (this.anObject1 != null) {
			local1 += this.anObject1.hashCode();
		}
		if (this.anObject2 != null) {
			local1 += this.anObject2.hashCode() * 31;
		}
		return local1;
	}
}
