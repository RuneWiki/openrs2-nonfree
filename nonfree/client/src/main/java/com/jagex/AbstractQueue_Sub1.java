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

@OriginalClass("client!ass")
public class AbstractQueue_Sub1 extends AbstractQueue {

	@OriginalMember(owner = "client!ass", name = "c", descriptor = "Ljava/util/Map;")
	Map aMap13;

	@OriginalMember(owner = "client!ass", name = "l", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator1;

	@OriginalMember(owner = "client!ass", name = "v", descriptor = "I")
	int anInt3153;

	@OriginalMember(owner = "client!ass", name = "p", descriptor = "[Lclient!nn;")
	Class424[] aClass424Array1;

	@OriginalMember(owner = "client!ass", name = "y", descriptor = "I")
	int anInt3154;

	@OriginalMember(owner = "client!ass", name = "<init>", descriptor = "(I)V", line = 13)
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0) {
		this(arg0, (Comparator) null);
	}

	@OriginalMember(owner = "client!ass", name = "<init>", descriptor = "(ILjava/util/Comparator;)V", line = 16)
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Comparator arg1) {
		this.anInt3154 = 0;
		this.aClass424Array1 = new Class424[arg0];
		this.aMap13 = new HashMap();
		this.aComparator1 = arg1;
	}

	@OriginalMember(owner = "client!ass", name = "p", descriptor = "(I)V", line = 23)
	void method23362() {
		@Pc(7) int local7 = (this.aClass424Array1.length << 1) + 1;
		this.aClass424Array1 = (Class424[]) Arrays.copyOf(this.aClass424Array1, local7);
	}

	@OriginalMember(owner = "client!ass", name = "size", descriptor = "()I", line = 28)
	@Override
	public int size() {
		return this.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!ass", name = "f", descriptor = "()I", line = 28)
	public int method23363() {
		return this.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!ass", name = "e", descriptor = "()I", line = 28)
	public int method23364() {
		return this.anInt3153 * 633845711;
	}

	@OriginalMember(owner = "client!ass", name = "l", descriptor = "(Ljava/lang/Object;)Z", line = 32)
	public boolean method23365(@OriginalArg(0) Object arg0) {
		if (this.aMap13.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3154 += -1418102489;
		@Pc(20) int local20 = this.anInt3153 * 633845711;
		if (local20 >= this.aClass424Array1.length) {
			this.method23362();
		}
		this.anInt3153 += 743829295;
		if (local20 == 0) {
			this.aClass424Array1[0] = new Class424(arg0, 0);
			this.aMap13.put(arg0, this.aClass424Array1[0]);
		} else {
			this.aClass424Array1[local20] = new Class424(arg0, local20);
			this.aMap13.put(arg0, this.aClass424Array1[local20]);
			this.method23380(local20);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "y", descriptor = "(Ljava/lang/Object;)Z", line = 32)
	public boolean method23366(@OriginalArg(0) Object arg0) {
		if (this.aMap13.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3154 += -1418102489;
		@Pc(20) int local20 = this.anInt3153 * 633845711;
		if (local20 >= this.aClass424Array1.length) {
			this.method23362();
		}
		this.anInt3153 += 743829295;
		if (local20 == 0) {
			this.aClass424Array1[0] = new Class424(arg0, 0);
			this.aMap13.put(arg0, this.aClass424Array1[0]);
		} else {
			this.aClass424Array1[local20] = new Class424(arg0, local20);
			this.aMap13.put(arg0, this.aClass424Array1[local20]);
			this.method23380(local20);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "offer", descriptor = "(Ljava/lang/Object;)Z", line = 32)
	@Override
	public boolean offer(@OriginalArg(0) Object arg0) {
		if (this.aMap13.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3154 += -1418102489;
		@Pc(20) int local20 = this.anInt3153 * 633845711;
		if (local20 >= this.aClass424Array1.length) {
			this.method23362();
		}
		this.anInt3153 += 743829295;
		if (local20 == 0) {
			this.aClass424Array1[0] = new Class424(arg0, 0);
			this.aMap13.put(arg0, this.aClass424Array1[0]);
		} else {
			this.aClass424Array1[local20] = new Class424(arg0, local20);
			this.aMap13.put(arg0, this.aClass424Array1[local20]);
			this.method23380(local20);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "w", descriptor = "(Ljava/lang/Object;)Z", line = 32)
	public boolean method23367(@OriginalArg(0) Object arg0) {
		if (this.aMap13.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3154 += -1418102489;
		@Pc(20) int local20 = this.anInt3153 * 633845711;
		if (local20 >= this.aClass424Array1.length) {
			this.method23362();
		}
		this.anInt3153 += 743829295;
		if (local20 == 0) {
			this.aClass424Array1[0] = new Class424(arg0, 0);
			this.aMap13.put(arg0, this.aClass424Array1[0]);
		} else {
			this.aClass424Array1[local20] = new Class424(arg0, local20);
			this.aMap13.put(arg0, this.aClass424Array1[local20]);
			this.method23380(local20);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "x", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method23368() {
		return this.anInt3153 * 633845711 == 0 ? null : this.aClass424Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!ass", name = "t", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method23369() {
		return this.anInt3153 * 633845711 == 0 ? null : this.aClass424Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!ass", name = "q", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method23370() {
		return this.anInt3153 * 633845711 == 0 ? null : this.aClass424Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!ass", name = "peek", descriptor = "()Ljava/lang/Object;", line = 50)
	@Override
	public Object peek() {
		return this.anInt3153 * 633845711 == 0 ? null : this.aClass424Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!ass", name = "poll", descriptor = "()Ljava/lang/Object;", line = 55)
	@Override
	public Object poll() {
		if (this.anInt3153 * 633845711 == 0) {
			return null;
		}
		this.anInt3154 += -1418102489;
		@Pc(18) Object local18 = this.aClass424Array1[0].anObject18;
		this.aMap13.remove(local18);
		this.anInt3153 -= 743829295;
		if (this.anInt3153 * 633845711 == 0) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
		} else {
			this.aClass424Array1[0] = this.aClass424Array1[this.anInt3153 * 633845711];
			this.aClass424Array1[0].anInt4808 = 0;
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			this.method23382(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ass", name = "d", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method23371() {
		if (this.anInt3153 * 633845711 == 0) {
			return null;
		}
		this.anInt3154 += -1418102489;
		@Pc(18) Object local18 = this.aClass424Array1[0].anObject18;
		this.aMap13.remove(local18);
		this.anInt3153 -= 743829295;
		if (this.anInt3153 * 633845711 == 0) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
		} else {
			this.aClass424Array1[0] = this.aClass424Array1[this.anInt3153 * 633845711];
			this.aClass424Array1[0].anInt4808 = 0;
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			this.method23382(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ass", name = "g", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method23372() {
		if (this.anInt3153 * 633845711 == 0) {
			return null;
		}
		this.anInt3154 += -1418102489;
		@Pc(18) Object local18 = this.aClass424Array1[0].anObject18;
		this.aMap13.remove(local18);
		this.anInt3153 -= 743829295;
		if (this.anInt3153 * 633845711 == 0) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
		} else {
			this.aClass424Array1[0] = this.aClass424Array1[this.anInt3153 * 633845711];
			this.aClass424Array1[0].anInt4808 = 0;
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			this.method23382(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ass", name = "z", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method23373() {
		if (this.anInt3153 * 633845711 == 0) {
			return null;
		}
		this.anInt3154 += -1418102489;
		@Pc(18) Object local18 = this.aClass424Array1[0].anObject18;
		this.aMap13.remove(local18);
		this.anInt3153 -= 743829295;
		if (this.anInt3153 * 633845711 == 0) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
		} else {
			this.aClass424Array1[0] = this.aClass424Array1[this.anInt3153 * 633845711];
			this.aClass424Array1[0].anInt4808 = 0;
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			this.method23382(0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ass", name = "o", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	public boolean method23374(@OriginalArg(0) Object arg0) {
		@Pc(5) Class424 local5 = (Class424) this.aMap13.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3154 += -1418102489;
		this.anInt3153 -= 743829295;
		if (local5.anInt4808 * -926875073 == this.anInt3153 * 633845711) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			return true;
		}
		@Pc(49) Class424 local49 = this.aClass424Array1[this.anInt3153 * 633845711];
		this.aClass424Array1[this.anInt3153 * 633845711] = null;
		this.aClass424Array1[local5.anInt4808 * -926875073] = local49;
		this.aClass424Array1[local5.anInt4808 * -926875073].anInt4808 = local5.anInt4808;
		this.method23382(local5.anInt4808 * -926875073);
		if (this.aClass424Array1[local5.anInt4808 * -926875073] == local49) {
			this.method23380(local5.anInt4808 * -926875073);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "remove", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		@Pc(5) Class424 local5 = (Class424) this.aMap13.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3154 += -1418102489;
		this.anInt3153 -= 743829295;
		if (local5.anInt4808 * -926875073 == this.anInt3153 * 633845711) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			return true;
		}
		@Pc(49) Class424 local49 = this.aClass424Array1[this.anInt3153 * 633845711];
		this.aClass424Array1[this.anInt3153 * 633845711] = null;
		this.aClass424Array1[local5.anInt4808 * -926875073] = local49;
		this.aClass424Array1[local5.anInt4808 * -926875073].anInt4808 = local5.anInt4808;
		this.method23382(local5.anInt4808 * -926875073);
		if (this.aClass424Array1[local5.anInt4808 * -926875073] == local49) {
			this.method23380(local5.anInt4808 * -926875073);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "b", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	public boolean method23375(@OriginalArg(0) Object arg0) {
		@Pc(5) Class424 local5 = (Class424) this.aMap13.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3154 += -1418102489;
		this.anInt3153 -= 743829295;
		if (local5.anInt4808 * -926875073 == this.anInt3153 * 633845711) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			return true;
		}
		@Pc(49) Class424 local49 = this.aClass424Array1[this.anInt3153 * 633845711];
		this.aClass424Array1[this.anInt3153 * 633845711] = null;
		this.aClass424Array1[local5.anInt4808 * -926875073] = local49;
		this.aClass424Array1[local5.anInt4808 * -926875073].anInt4808 = local5.anInt4808;
		this.method23382(local5.anInt4808 * -926875073);
		if (this.aClass424Array1[local5.anInt4808 * -926875073] == local49) {
			this.method23380(local5.anInt4808 * -926875073);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "n", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	public boolean method23376(@OriginalArg(0) Object arg0) {
		@Pc(5) Class424 local5 = (Class424) this.aMap13.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3154 += -1418102489;
		this.anInt3153 -= 743829295;
		if (local5.anInt4808 * -926875073 == this.anInt3153 * 633845711) {
			this.aClass424Array1[this.anInt3153 * 633845711] = null;
			return true;
		}
		@Pc(49) Class424 local49 = this.aClass424Array1[this.anInt3153 * 633845711];
		this.aClass424Array1[this.anInt3153 * 633845711] = null;
		this.aClass424Array1[local5.anInt4808 * -926875073] = local49;
		this.aClass424Array1[local5.anInt4808 * -926875073].anInt4808 = local5.anInt4808;
		this.method23382(local5.anInt4808 * -926875073);
		if (this.aClass424Array1[local5.anInt4808 * -926875073] == local49) {
			this.method23380(local5.anInt4808 * -926875073);
		}
		return true;
	}

	@OriginalMember(owner = "client!ass", name = "i", descriptor = "(I)V", line = 89)
	void method23377(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class424 local17 = this.aClass424Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass424Array1[arg0] = local17;
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local12;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "k", descriptor = "(I)V", line = 89)
	void method23378(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class424 local17 = this.aClass424Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass424Array1[arg0] = local17;
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local12;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "u", descriptor = "(I)V", line = 89)
	void method23379(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class424 local17 = this.aClass424Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass424Array1[arg0] = local17;
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local12;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "c", descriptor = "(II)V", line = 89)
	void method23380(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class424 local17 = this.aClass424Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass424Array1[arg0] = local17;
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local12;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "j", descriptor = "(I)V", line = 89)
	void method23381(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class424 local17 = this.aClass424Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass424Array1[arg0] = local17;
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local12;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "v", descriptor = "(IB)V", line = 108)
	void method23382(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		@Pc(11) int local11 = this.anInt3153 * 633845711 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class424 local25 = this.aClass424Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class424 local36 = this.aClass424Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3153 * 633845711 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3153 * 633845711 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass424Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass424Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass424Array1[arg0] = this.aClass424Array1[local55];
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local55;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "aj", descriptor = "(I)V", line = 108)
	void method23383(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		@Pc(11) int local11 = this.anInt3153 * 633845711 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class424 local25 = this.aClass424Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class424 local36 = this.aClass424Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3153 * 633845711 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3153 * 633845711 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass424Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass424Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass424Array1[arg0] = this.aClass424Array1[local55];
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local55;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "ai", descriptor = "(I)V", line = 108)
	void method23384(@OriginalArg(0) int arg0) {
		@Pc(4) Class424 local4 = this.aClass424Array1[arg0];
		@Pc(11) int local11 = this.anInt3153 * 633845711 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class424 local25 = this.aClass424Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class424 local36 = this.aClass424Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3153 * 633845711 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3153 * 633845711 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass424Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass424Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass424Array1[arg0] = this.aClass424Array1[local55];
			this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
			arg0 = local55;
		}
		this.aClass424Array1[arg0] = local4;
		this.aClass424Array1[arg0].anInt4808 = arg0 * -1235882561;
	}

	@OriginalMember(owner = "client!ass", name = "contains", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		return this.aMap13.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ass", name = "a", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	public boolean method23385(@OriginalArg(0) Object arg0) {
		return this.aMap13.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ass", name = "m", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	public boolean method23386(@OriginalArg(0) Object arg0) {
		return this.aMap13.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ass", name = "toArray", descriptor = "()[Ljava/lang/Object;", line = 143)
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

	@OriginalMember(owner = "client!ass", name = "h", descriptor = "()[Ljava/lang/Object;", line = 143)
	public Object[] method23387() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.aComparator1 == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.aComparator1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!ass", name = "s", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method23388() {
		return new Class421(this);
	}

	@OriginalMember(owner = "client!ass", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 150)
	@Override
	public Iterator iterator() {
		return new Class421(this);
	}

	@OriginalMember(owner = "client!ass", name = "r", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method23389() {
		return new Class421(this);
	}
}
