package com.jagex;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anr")
public class AbstractQueue_Sub1 extends AbstractQueue {

	@OriginalMember(owner = "client!anr", name = "a", descriptor = "Ljava/util/Map;")
	Map aMap6;

	@OriginalMember(owner = "client!anr", name = "p", descriptor = "[Lclient!kq;")
	Class285[] aClass285Array1;

	@OriginalMember(owner = "client!anr", name = "g", descriptor = "I")
	int anInt2794;

	@OriginalMember(owner = "client!anr", name = "l", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator1;

	@OriginalMember(owner = "client!anr", name = "h", descriptor = "I")
	int anInt2795;

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(I)V", line = 13)
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0) {
		this(arg0, (Comparator) null);
	}

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(ILjava/util/Comparator;)V", line = 16)
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Comparator arg1) {
		this.anInt2795 = 0;
		this.aClass285Array1 = new Class285[arg0];
		this.aMap6 = new HashMap();
		this.aComparator1 = arg1;
	}

	@OriginalMember(owner = "client!anr", name = "p", descriptor = "(I)V", line = 23)
	void method20167() {
		@Pc(7) int local7 = (this.aClass285Array1.length << 1) + 1;
		this.aClass285Array1 = (Class285[]) Arrays.copyOf(this.aClass285Array1, local7);
	}

	@OriginalMember(owner = "client!anr", name = "size", descriptor = "()I", line = 28)
	@Override
	public int size() {
		return this.anInt2794 * -1478446217;
	}

	@OriginalMember(owner = "client!anr", name = "v", descriptor = "()I", line = 28)
	public int method20169() {
		return this.anInt2794 * -1478446217;
	}

	@OriginalMember(owner = "client!anr", name = "t", descriptor = "()I", line = 28)
	public int method20170() {
		return this.anInt2794 * -1478446217;
	}

	@OriginalMember(owner = "client!anr", name = "offer", descriptor = "(Ljava/lang/Object;)Z", line = 32)
	@Override
	public boolean offer(@OriginalArg(0) Object arg0) {
		if (this.aMap6.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt2795 += -1256162999;
		@Pc(20) int local20 = this.anInt2794 * -1478446217;
		if (local20 >= this.aClass285Array1.length) {
			this.method20167();
		}
		this.anInt2794 += -447867321;
		if (local20 == 0) {
			this.aClass285Array1[0] = new Class285(arg0, 0);
			this.aMap6.put(arg0, this.aClass285Array1[0]);
		} else {
			this.aClass285Array1[local20] = new Class285(arg0, local20);
			this.aMap6.put(arg0, this.aClass285Array1[local20]);
			this.method20174(local20);
		}
		return true;
	}

	@OriginalMember(owner = "client!anr", name = "u", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method20165() {
		return this.anInt2794 * -1478446217 == 0 ? null : this.aClass285Array1[0].anObject16;
	}

	@OriginalMember(owner = "client!anr", name = "s", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method20166() {
		return this.anInt2794 * -1478446217 == 0 ? null : this.aClass285Array1[0].anObject16;
	}

	@OriginalMember(owner = "client!anr", name = "peek", descriptor = "()Ljava/lang/Object;", line = 50)
	@Override
	public Object peek() {
		return this.anInt2794 * -1478446217 == 0 ? null : this.aClass285Array1[0].anObject16;
	}

	@OriginalMember(owner = "client!anr", name = "poll", descriptor = "()Ljava/lang/Object;", line = 55)
	@Override
	public Object poll() {
		if (this.anInt2794 * -1478446217 == 0) {
			return null;
		}
		this.anInt2795 += -1256162999;
		@Pc(18) Object local18 = this.aClass285Array1[0].anObject16;
		this.aMap6.remove(local18);
		this.anInt2794 -= -447867321;
		if (this.anInt2794 * -1478446217 == 0) {
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
		} else {
			this.aClass285Array1[0] = this.aClass285Array1[this.anInt2794 * -1478446217];
			this.aClass285Array1[0].anInt4356 = 0;
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
			this.method20171(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!anr", name = "y", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method20173() {
		if (this.anInt2794 * -1478446217 == 0) {
			return null;
		}
		this.anInt2795 += -1256162999;
		@Pc(18) Object local18 = this.aClass285Array1[0].anObject16;
		this.aMap6.remove(local18);
		this.anInt2794 -= -447867321;
		if (this.anInt2794 * -1478446217 == 0) {
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
		} else {
			this.aClass285Array1[0] = this.aClass285Array1[this.anInt2794 * -1478446217];
			this.aClass285Array1[0].anInt4356 = 0;
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
			this.method20171(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!anr", name = "c", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method20175() {
		if (this.anInt2794 * -1478446217 == 0) {
			return null;
		}
		this.anInt2795 += -1256162999;
		@Pc(18) Object local18 = this.aClass285Array1[0].anObject16;
		this.aMap6.remove(local18);
		this.anInt2794 -= -447867321;
		if (this.anInt2794 * -1478446217 == 0) {
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
		} else {
			this.aClass285Array1[0] = this.aClass285Array1[this.anInt2794 * -1478446217];
			this.aClass285Array1[0].anInt4356 = 0;
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
			this.method20171(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!anr", name = "b", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method20177() {
		if (this.anInt2794 * -1478446217 == 0) {
			return null;
		}
		this.anInt2795 += -1256162999;
		@Pc(18) Object local18 = this.aClass285Array1[0].anObject16;
		this.aMap6.remove(local18);
		this.anInt2794 -= -447867321;
		if (this.anInt2794 * -1478446217 == 0) {
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
		} else {
			this.aClass285Array1[0] = this.aClass285Array1[this.anInt2794 * -1478446217];
			this.aClass285Array1[0].anInt4356 = 0;
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
			this.method20171(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!anr", name = "z", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method20183() {
		if (this.anInt2794 * -1478446217 == 0) {
			return null;
		}
		this.anInt2795 += -1256162999;
		@Pc(18) Object local18 = this.aClass285Array1[0].anObject16;
		this.aMap6.remove(local18);
		this.anInt2794 -= -447867321;
		if (this.anInt2794 * -1478446217 == 0) {
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
		} else {
			this.aClass285Array1[0] = this.aClass285Array1[this.anInt2794 * -1478446217];
			this.aClass285Array1[0].anInt4356 = 0;
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
			this.method20171(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!anr", name = "remove", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		@Pc(5) Class285 local5 = (Class285) this.aMap6.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt2795 += -1256162999;
		this.anInt2794 -= -447867321;
		if (this.anInt2794 * -1478446217 == local5.anInt4356 * -669823449) {
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
			return true;
		}
		@Pc(48) Class285 local48 = this.aClass285Array1[this.anInt2794 * -1478446217];
		this.aClass285Array1[this.anInt2794 * -1478446217] = null;
		this.aClass285Array1[local5.anInt4356 * -669823449] = local48;
		this.aClass285Array1[local5.anInt4356 * -669823449].anInt4356 = local5.anInt4356;
		this.method20171(local5.anInt4356 * -669823449);
		if (local48 == this.aClass285Array1[local5.anInt4356 * -669823449]) {
			this.method20174(local5.anInt4356 * -669823449);
		}
		return true;
	}

	@OriginalMember(owner = "client!anr", name = "w", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	public boolean method20168(@OriginalArg(0) Object arg0) {
		@Pc(5) Class285 local5 = (Class285) this.aMap6.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt2795 += -1256162999;
		this.anInt2794 -= -447867321;
		if (this.anInt2794 * -1478446217 == local5.anInt4356 * -669823449) {
			this.aClass285Array1[this.anInt2794 * -1478446217] = null;
			return true;
		}
		@Pc(48) Class285 local48 = this.aClass285Array1[this.anInt2794 * -1478446217];
		this.aClass285Array1[this.anInt2794 * -1478446217] = null;
		this.aClass285Array1[local5.anInt4356 * -669823449] = local48;
		this.aClass285Array1[local5.anInt4356 * -669823449].anInt4356 = local5.anInt4356;
		this.method20171(local5.anInt4356 * -669823449);
		if (local48 == this.aClass285Array1[local5.anInt4356 * -669823449]) {
			this.method20174(local5.anInt4356 * -669823449);
		}
		return true;
	}

	@OriginalMember(owner = "client!anr", name = "a", descriptor = "(II)V", line = 89)
	void method20174(@OriginalArg(0) int arg0) {
		@Pc(4) Class285 local4 = this.aClass285Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class285 local17 = this.aClass285Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject16).compareTo(local17.anObject16) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject16, local17.anObject16) >= 0) {
				break;
			}
			this.aClass285Array1[arg0] = local17;
			this.aClass285Array1[arg0].anInt4356 = arg0 * -869056105;
			arg0 = local12;
		}
		this.aClass285Array1[arg0] = local4;
		this.aClass285Array1[arg0].anInt4356 = arg0 * -869056105;
	}

	@OriginalMember(owner = "client!anr", name = "g", descriptor = "(IB)V", line = 108)
	void method20171(@OriginalArg(0) int arg0) {
		@Pc(4) Class285 local4 = this.aClass285Array1[arg0];
		@Pc(11) int local11 = this.anInt2794 * -1478446217 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class285 local25 = this.aClass285Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class285 local36 = this.aClass285Array1[local31];
			@Pc(56) int local56;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt2794 * -1478446217 && ((Comparable) local25.anObject16).compareTo(local36.anObject16) > 0) {
					local56 = local31;
				} else {
					local56 = local20;
				}
			} else if (local31 < this.anInt2794 * -1478446217 && this.aComparator1.compare(local25.anObject16, local36.anObject16) > 0) {
				local56 = local31;
			} else {
				local56 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject16).compareTo(this.aClass285Array1[local56].anObject16) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject16, this.aClass285Array1[local56].anObject16) <= 0) {
				break;
			}
			this.aClass285Array1[arg0] = this.aClass285Array1[local56];
			this.aClass285Array1[arg0].anInt4356 = arg0 * -869056105;
			arg0 = local56;
		}
		this.aClass285Array1[arg0] = local4;
		this.aClass285Array1[arg0].anInt4356 = arg0 * -869056105;
	}

	@OriginalMember(owner = "client!anr", name = "j", descriptor = "(I)V", line = 108)
	void method20178(@OriginalArg(0) int arg0) {
		@Pc(4) Class285 local4 = this.aClass285Array1[arg0];
		@Pc(11) int local11 = this.anInt2794 * -1478446217 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class285 local25 = this.aClass285Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class285 local36 = this.aClass285Array1[local31];
			@Pc(56) int local56;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt2794 * -1478446217 && ((Comparable) local25.anObject16).compareTo(local36.anObject16) > 0) {
					local56 = local31;
				} else {
					local56 = local20;
				}
			} else if (local31 < this.anInt2794 * -1478446217 && this.aComparator1.compare(local25.anObject16, local36.anObject16) > 0) {
				local56 = local31;
			} else {
				local56 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject16).compareTo(this.aClass285Array1[local56].anObject16) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject16, this.aClass285Array1[local56].anObject16) <= 0) {
				break;
			}
			this.aClass285Array1[arg0] = this.aClass285Array1[local56];
			this.aClass285Array1[arg0].anInt4356 = arg0 * -869056105;
			arg0 = local56;
		}
		this.aClass285Array1[arg0] = local4;
		this.aClass285Array1[arg0].anInt4356 = arg0 * -869056105;
	}

	@OriginalMember(owner = "client!anr", name = "contains", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		return this.aMap6.containsKey(arg0);
	}

	@OriginalMember(owner = "client!anr", name = "ac", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	public boolean method20172(@OriginalArg(0) Object arg0) {
		return this.aMap6.containsKey(arg0);
	}

	@OriginalMember(owner = "client!anr", name = "aw", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	public boolean method20182(@OriginalArg(0) Object arg0) {
		return this.aMap6.containsKey(arg0);
	}

	@OriginalMember(owner = "client!anr", name = "toArray", descriptor = "()[Ljava/lang/Object;", line = 143)
	@Override
	public Object[] toArray() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.aComparator1 == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.aComparator1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!anr", name = "o", descriptor = "()[Ljava/lang/Object;", line = 143)
	public Object[] method20176() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.aComparator1 == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.aComparator1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!anr", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 150)
	@Override
	public Iterator iterator() {
		return new Class272(this);
	}

	@OriginalMember(owner = "client!anr", name = "l", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method20179() {
		return new Class272(this);
	}

	@OriginalMember(owner = "client!anr", name = "h", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method20180() {
		return new Class272(this);
	}

	@OriginalMember(owner = "client!anr", name = "x", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method20181() {
		return new Class272(this);
	}
}
