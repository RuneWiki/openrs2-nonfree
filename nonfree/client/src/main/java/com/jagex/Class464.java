package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class Class464 {

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	public int anInt5072;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public int anInt5071;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	public int anInt5073;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V", line = 8)
	public Class464() {
		this.anInt5072 = 1921893805;
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(III)V", line = 12)
	public Class464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5072 = arg0 * -1921893805;
		this.anInt5071 = arg1 * -70999759;
		this.anInt5073 = arg2 * -1055832143;
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(I)V", line = 18)
	public Class464(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			this.anInt5072 = 1921893805;
		} else {
			this.anInt5072 = (arg0 >> 28 & 0x3) * -1921893805;
			this.anInt5071 = (arg0 >> 14 & 0x3FFF) * -70999759;
			this.anInt5073 = (arg0 & 0x3FFF) * -1055832143;
		}
	}

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "(Lclient!agq;I)V", line = 28)
	public void method28616(@OriginalArg(0) Class3_Sub32 arg0) {
		this.anInt5072 = arg0.anInt1342 * 942506045;
		this.anInt5071 = (arg0.anInt1343 * 2061226997 >> 9) * -70999759;
		this.anInt5073 = (arg0.anInt1344 * 615450365 >> 9) * -1055832143;
	}

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "(Lclient!agq;)V", line = 28)
	public void method28624(@OriginalArg(0) Class3_Sub32 arg0) {
		this.anInt5072 = arg0.anInt1342 * 942506045;
		this.anInt5071 = (arg0.anInt1343 * 2061226997 >> 9) * -70999759;
		this.anInt5073 = (arg0.anInt1344 * 615450365 >> 9) * -1055832143;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I", line = 34)
	public int method28625() {
		return this.anInt5072 * 324147675 << 28 | this.anInt5071 * -1567811631 << 14 | this.anInt5073 * 1360175441;
	}

	@OriginalMember(owner = "client!sr", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class464) {
			return this.method28618((Class464) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method28620(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class464) {
			return this.method28618((Class464) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 38)
	public boolean method28621(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class464) {
			return this.method28618((Class464) arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "(Lclient!sr;)Z", line = 44)
	boolean method28614(@OriginalArg(0) Class464 arg0) {
		if (arg0.anInt5072 * 324147675 != this.anInt5072 * 324147675) {
			return false;
		} else if (this.anInt5071 * -1567811631 == arg0.anInt5071 * -1567811631) {
			return arg0.anInt5073 * 1360175441 == this.anInt5073 * 1360175441;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "(Lclient!sr;)Z", line = 44)
	boolean method28617(@OriginalArg(0) Class464 arg0) {
		if (arg0.anInt5072 * 324147675 != this.anInt5072 * 324147675) {
			return false;
		} else if (this.anInt5071 * -1567811631 == arg0.anInt5071 * -1567811631) {
			return arg0.anInt5073 * 1360175441 == this.anInt5073 * 1360175441;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(Lclient!sr;I)Z", line = 44)
	boolean method28618(@OriginalArg(0) Class464 arg0) {
		if (arg0.anInt5072 * 324147675 != this.anInt5072 * 324147675) {
			return false;
		} else if (this.anInt5071 * -1567811631 == arg0.anInt5071 * -1567811631) {
			return arg0.anInt5073 * 1360175441 == this.anInt5073 * 1360175441;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "ol", descriptor = "()I", line = 51)
	public int method28615() {
		return this.method28625();
	}

	@OriginalMember(owner = "client!sr", name = "hashCode", descriptor = "()I", line = 51)
	@Override
	public int hashCode() {
		return this.method28625();
	}

	@OriginalMember(owner = "client!sr", name = "oy", descriptor = "()I", line = 51)
	public int method28619() {
		return this.method28625();
	}

	@OriginalMember(owner = "client!sr", name = "ox", descriptor = "()Ljava/lang/String;", line = 56)
	public String method28622() {
		return this.anInt5072 * 324147675 + "," + (this.anInt5071 * -1567811631 >> 6) + "," + (this.anInt5073 * 1360175441 >> 6) + "," + (this.anInt5071 * -1567811631 & 0x3F) + "," + (this.anInt5073 * 1360175441 & 0x3F);
	}

	@OriginalMember(owner = "client!sr", name = "ou", descriptor = "()Ljava/lang/String;", line = 56)
	public String method28623() {
		return this.anInt5072 * 324147675 + "," + (this.anInt5071 * -1567811631 >> 6) + "," + (this.anInt5073 * 1360175441 >> 6) + "," + (this.anInt5071 * -1567811631 & 0x3F) + "," + (this.anInt5073 * 1360175441 & 0x3F);
	}

	@OriginalMember(owner = "client!sr", name = "toString", descriptor = "()Ljava/lang/String;", line = 56)
	@Override
	public String toString() {
		return this.anInt5072 * 324147675 + "," + (this.anInt5071 * -1567811631 >> 6) + "," + (this.anInt5073 * 1360175441 >> 6) + "," + (this.anInt5071 * -1567811631 & 0x3F) + "," + (this.anInt5073 * 1360175441 & 0x3F);
	}

	@OriginalMember(owner = "client!sr", name = "cp", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4448)
	static final void method28626(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 624249098;
		arg0.anInt3573 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * 1208565773;
		if (arg0.anInt3573 * 598019781 > arg0.anInt3554 * -1920517457 - arg0.anInt3498 * -1494060731) {
			arg0.anInt3573 = arg0.anInt3554 * 1185987299 - arg0.anInt3498 * 2047737985;
		}
		if (arg0.anInt3573 * 598019781 < 0) {
			arg0.anInt3573 = 0;
		}
		arg0.anInt3557 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -288477635;
		if (arg0.anInt3557 * 1648318741 > arg0.anInt3505 * 247707339 - arg0.anInt3499 * -751005789) {
			arg0.anInt3557 = arg0.anInt3505 * -2133522337 - arg0.anInt3499 * 1449624535;
		}
		if (arg0.anInt3557 * 1648318741 < 0) {
			arg0.anInt3557 = 0;
		}
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class437.method28032(arg0.anInt3570 * 954808515);
		}
	}
}
