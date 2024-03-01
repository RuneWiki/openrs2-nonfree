package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abn")
public class Class40 implements Interface3 {

	@OriginalMember(owner = "client!abn", name = "fp", descriptor = "Lclient!py;")
	public static Class497 aClass497_4;

	@OriginalMember(owner = "client!abn", name = "e", descriptor = "Ljava/util/Map;")
	Map aMap3;

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "Lclient!os;")
	final Interface51 anInterface51_1;

	@OriginalMember(owner = "client!abn", name = "<init>", descriptor = "(Lclient!os;)V", line = 11)
	public Class40(@OriginalArg(0) Interface51 arg0) {
		this.anInterface51_1 = arg0;
	}

	@OriginalMember(owner = "client!abn", name = "e", descriptor = "(II)I", line = 16)
	@Override
	public int method781(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(10) Class466 local10 = (Class466) this.aMap3.get(arg0);
			if (local10 != null) {
				return (Integer) local10.anObject19;
			}
		}
		return (Integer) this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "z", descriptor = "(I)I", line = 16)
	@Override
	public int method790(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(10) Class466 local10 = (Class466) this.aMap3.get(arg0);
			if (local10 != null) {
				return (Integer) local10.anObject19;
			}
		}
		return (Integer) this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "r", descriptor = "(I)I", line = 16)
	@Override
	public int method780(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(10) Class466 local10 = (Class466) this.aMap3.get(arg0);
			if (local10 != null) {
				return (Integer) local10.anObject19;
			}
		}
		return (Integer) this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "(IIII)I", line = 19)
	public static int method800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "(IIB)V", line = 24)
	@Override
	public void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "v", descriptor = "(II)V", line = 24)
	@Override
	public void method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "m", descriptor = "(II)J", line = 36)
	@Override
	public long method779(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "s", descriptor = "(I)J", line = 36)
	@Override
	public long method783(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "o", descriptor = "(I)J", line = 36)
	@Override
	public long method771(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "y", descriptor = "(I)J", line = 36)
	@Override
	public long method784(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "k", descriptor = "(IJ)V", line = 44)
	@Override
	public void method787(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "q", descriptor = "(IJ)V", line = 44)
	@Override
	public void method785(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "f", descriptor = "(II)Ljava/lang/Object;", line = 56)
	@Override
	public Object method775(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "x", descriptor = "(I)Ljava/lang/Object;", line = 56)
	@Override
	public Object method786(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 56)
	@Override
	public Object method793(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface51_1.method1460(arg0);
	}

	@OriginalMember(owner = "client!abn", name = "w", descriptor = "(ILjava/lang/Object;B)V", line = 64)
	@Override
	public void method776(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "h", descriptor = "(ILjava/lang/Object;)V", line = 64)
	@Override
	public void method782(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "(JLjava/lang/String;B)I", line = 66)
	public static final int method797(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class93_Sub41 local8 = new Class93_Sub41(128);
		@Pc(13) Class93_Sub41 local13 = new Class93_Sub41(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method22510(10);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22395(local3.nextInt());
		}
		local8.method22395(local16[0]);
		local8.method22395(local16[1]);
		local8.method22399(arg0);
		local8.method22399(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22395(local3.nextInt());
		}
		local8.method22416(Class630.aBigInteger7, Class630.aBigInteger8);
		local13.method22510(10);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method22395(local3.nextInt());
		}
		local13.method22399(local3.nextLong());
		local13.method22398(local3.nextLong());
		Class314.method26940(local13);
		local13.method22399(local3.nextLong());
		local13.method22416(Class630.aBigInteger7, Class630.aBigInteger8);
		local44 = Class46.method894(arg1);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(146) Class93_Sub41 local146 = new Class93_Sub41(local44);
		local146.method22402(arg1);
		local146.anInt3070 = local44 * -1445626955;
		local146.method22475(local16);
		@Pc(179) Class93_Sub41 local179 = new Class93_Sub41(local13.anInt3070 * 212851357 + 5 + local8.anInt3070 * 212851357 + local146.anInt3070 * 212851357);
		local179.method22510(2);
		local179.method22510(local8.anInt3070 * 212851357);
		local179.method22405(local8.aByteArray58, 0, local8.anInt3070 * 212851357);
		local179.method22510(local13.anInt3070 * 212851357);
		local179.method22405(local13.aByteArray58, 0, local13.anInt3070 * 212851357);
		local179.method22454(local146.anInt3070 * 212851357);
		local179.method22405(local146.aByteArray58, 0, local146.anInt3070 * 212851357);
		@Pc(239) String local239 = Class669.method32943(local179.aByteArray58);
		try {
			@Pc(254) URL local254 = new URL(Class119.method8605("services", false) + "m=accountappeal/login.ws");
			@Pc(257) URLConnection local257 = local254.openConnection();
			local257.setDoInput(true);
			local257.setDoOutput(true);
			local257.setConnectTimeout(5000);
			@Pc(272) OutputStreamWriter local272 = new OutputStreamWriter(local257.getOutputStream());
			local272.write("data2=" + Class25_Sub2.method16021(local239) + "&dest=" + Class25_Sub2.method16021("passwordchoice.ws"));
			local272.flush();
			@Pc(295) InputStream local295 = local257.getInputStream();
			local179 = new Class93_Sub41(new byte[1000]);
			do {
				@Pc(316) int local316 = local295.read(local179.aByteArray58, local179.anInt3070 * 212851357, 1000 - local179.anInt3070 * 212851357);
				if (local316 == -1) {
					local272.close();
					local295.close();
					@Pc(347) String local347 = new String(local179.aByteArray58);
					if (local347.startsWith("OFFLINE")) {
						return 4;
					} else if (local347.startsWith("WRONG")) {
						return 7;
					} else if (local347.startsWith("RELOAD")) {
						return 3;
					} else if (local347.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local179.method22440(local16);
						while (local179.anInt3070 * 212851357 > 0 && local179.aByteArray58[local179.anInt3070 * 212851357 - 1] == 0) {
							local179.anInt3070 -= -1445626955;
						}
						local347 = new String(local179.aByteArray58, 0, local179.anInt3070 * 212851357);
						if (Class89.method1600(local347)) {
							Class338.method27468(local347, true, client.aBoolean596);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local179.anInt3070 += local316 * -1445626955;
			} while (local179.anInt3070 * 212851357 < 1000);
			return 5;
		} catch (@Pc(423) Throwable local423) {
			local423.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!abn", name = "a", descriptor = "()V", line = 76)
	@Override
	public void method789() {
		if (this.aMap3 != null) {
			this.aMap3.clear();
		}
	}

	@OriginalMember(owner = "client!abn", name = "g", descriptor = "()V", line = 76)
	@Override
	public void method788() {
		if (this.aMap3 != null) {
			this.aMap3.clear();
		}
	}

	@OriginalMember(owner = "client!abn", name = "l", descriptor = "(I)V", line = 76)
	@Override
	public void method777() {
		if (this.aMap3 != null) {
			this.aMap3.clear();
		}
	}

	@OriginalMember(owner = "client!abn", name = "i", descriptor = "(I)V", line = 80)
	@Override
	public void method791(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "u", descriptor = "(IB)V", line = 80)
	@Override
	public void method778(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "j", descriptor = "(I)V", line = 80)
	@Override
	public void method774(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "t", descriptor = "(I)V", line = 80)
	@Override
	public void method773(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "p", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method794() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 84)
	@Override
	public Iterator iterator() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "d", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method795() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "c", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method796() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "adr", descriptor = "(Lclient!yf;I)V", line = 10138)
	static final void method798(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].method30429();
	}

	@OriginalMember(owner = "client!abn", name = "kl", descriptor = "(Lclient!hf;I)Lclient!hf;", line = 11810)
	static Class312 method799(@OriginalArg(0) Class312 arg0) {
		@Pc(2) Class312 local2 = client.method25279(arg0);
		if (local2 == null) {
			local2 = arg0.aClass312_9;
		}
		return local2;
	}
}
