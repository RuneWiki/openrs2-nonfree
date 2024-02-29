package com.jagex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aah")
public class Class9 implements Interface3 {

	@OriginalMember(owner = "client!aah", name = "p", descriptor = "Ljava/util/Map;")
	Map aMap1;

	@OriginalMember(owner = "client!aah", name = "c", descriptor = "Lclient!ok;")
	final Interface53 anInterface53_1;

	@OriginalMember(owner = "client!aah", name = "<init>", descriptor = "(Lclient!ok;)V", line = 11)
	public Class9(@OriginalArg(0) Interface53 arg0) {
		this.anInterface53_1 = arg0;
	}

	@OriginalMember(owner = "client!aah", name = "p", descriptor = "(II)I", line = 16)
	@Override
	public int method131(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject19;
			}
		}
		return (Integer) this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "x", descriptor = "(I)I", line = 16)
	@Override
	public int method129(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject19;
			}
		}
		return (Integer) this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "d", descriptor = "(I)I", line = 16)
	@Override
	public int method123(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject19;
			}
		}
		return (Integer) this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "g", descriptor = "(I)I", line = 16)
	@Override
	public int method133(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Integer) local9.anObject19;
			}
		}
		return (Integer) this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "c", descriptor = "(IIB)V", line = 24)
	@Override
	public void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(28) Class438 local28 = (Class438) this.aMap1.get(arg0);
		if (local28 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local28.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "z", descriptor = "(II)V", line = 24)
	@Override
	public void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(28) Class438 local28 = (Class438) this.aMap1.get(arg0);
		if (local28 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local28.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "j", descriptor = "(II)V", line = 24)
	@Override
	public void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(28) Class438 local28 = (Class438) this.aMap1.get(arg0);
		if (local28 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local28.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "v", descriptor = "(II)J", line = 36)
	@Override
	public long method125(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "i", descriptor = "(I)J", line = 36)
	@Override
	public long method136(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "l", descriptor = "(IJ)V", line = 44)
	@Override
	public void method126(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(27) Class438 local27 = (Class438) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "k", descriptor = "(IJ)V", line = 44)
	@Override
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(27) Class438 local27 = (Class438) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "u", descriptor = "(IJ)V", line = 44)
	@Override
	public void method138(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(27) Class438 local27 = (Class438) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "e", descriptor = "(IJ)V", line = 44)
	@Override
	public void method139(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(27) Class438 local27 = (Class438) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 56)
	@Override
	public Object method140(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "y", descriptor = "(II)Ljava/lang/Object;", line = 56)
	@Override
	public Object method144(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			@Pc(9) Class438 local9 = (Class438) this.aMap1.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface53_1.method1940(arg0);
	}

	@OriginalMember(owner = "client!aah", name = "w", descriptor = "(ILjava/lang/Object;S)V", line = 64)
	@Override
	public void method128(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(27) Class438 local27 = (Class438) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "o", descriptor = "(ILjava/lang/Object;)V", line = 64)
	@Override
	public void method141(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(27) Class438 local27 = (Class438) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "b", descriptor = "(ILjava/lang/Object;)V", line = 64)
	@Override
	public void method142(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap1 == null) {
			this.aMap1 = new HashMap();
			this.aMap1.put(arg0, new Class438(arg0, arg1));
			return;
		}
		@Pc(27) Class438 local27 = (Class438) this.aMap1.get(arg0);
		if (local27 == null) {
			this.aMap1.put(arg0, new Class438(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!aah", name = "t", descriptor = "(I)V", line = 76)
	@Override
	public void method132() {
		if (this.aMap1 != null) {
			this.aMap1.clear();
		}
	}

	@OriginalMember(owner = "client!aah", name = "n", descriptor = "()V", line = 76)
	@Override
	public void method143() {
		if (this.aMap1 != null) {
			this.aMap1.clear();
		}
	}

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "(I)V", line = 80)
	@Override
	public void method145(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!aah", name = "aj", descriptor = "(I)V", line = 80)
	@Override
	public void method147(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!aah", name = "q", descriptor = "(II)V", line = 80)
	@Override
	public void method130(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!aah", name = "a", descriptor = "(I)V", line = 80)
	@Override
	public void method124(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!aah", name = "h", descriptor = "(I)V", line = 80)
	@Override
	public void method146(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!aah", name = "ai", descriptor = "(I)V", line = 80)
	@Override
	public void method148(@OriginalArg(0) int arg0) {
		if (this.aMap1 != null) {
			this.aMap1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!aah", name = "r", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method149() {
		return this.aMap1 == null ? Collections.emptyList().iterator() : this.aMap1.values().iterator();
	}

	@OriginalMember(owner = "client!aah", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 84)
	@Override
	public Iterator iterator() {
		return this.aMap1 == null ? Collections.emptyList().iterator() : this.aMap1.values().iterator();
	}

	@OriginalMember(owner = "client!aah", name = "s", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method150() {
		return this.aMap1 == null ? Collections.emptyList().iterator() : this.aMap1.values().iterator();
	}

	@OriginalMember(owner = "client!aah", name = "ae", descriptor = "(Lclient!yf;B)V", line = 4498)
	static final void method151(@OriginalArg(0) Class665 arg0) {
		@Pc(7) int local7 = arg0.anIntArray535[arg0.anInt5786 * 662605117];
		arg0.anInt5781 -= local7 * 1460193483;
		@Pc(25) String local25 = Class660.method33073(arg0.anObjectArray45, arg0.anInt5781 * 1485266147, local7);
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local25;
	}
}
