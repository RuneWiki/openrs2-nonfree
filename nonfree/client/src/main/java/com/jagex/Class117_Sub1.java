package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahe")
public class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!ahe", name = "p", descriptor = "F")
	static final float aFloat129 = 2.0F;

	@OriginalMember(owner = "client!ahe", name = "l", descriptor = "Z")
	volatile boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ahe", name = "t", descriptor = "Ljava/util/List;")
	List aList1 = new ArrayList();

	@OriginalMember(owner = "client!ahe", name = "q", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable3 = new Class555(this);

	@OriginalMember(owner = "client!ahe", name = "x", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable2 = new Class550(this);

	@OriginalMember(owner = "client!ahe", name = "v", descriptor = "Lclient!ll;")
	Class379 aClass379_1 = new Class379(this);

	@OriginalMember(owner = "client!ahe", name = "c", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap2 = new HashMap();

	@OriginalMember(owner = "client!ahe", name = "y", descriptor = "Ljava/lang/Thread;")
	Thread aThread1;

	@OriginalMember(owner = "client!ahe", name = "w", descriptor = "Ljava/lang/Thread;")
	Thread aThread2;

	@OriginalMember(owner = "client!ahe", name = "ax", descriptor = "()Ljava/util/HashMap;", line = 99)
	HashMap method10180() {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!ahe", name = "ak", descriptor = "(I)Ljava/util/HashMap;", line = 99)
	HashMap method10181() {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!ahe", name = "<init>", descriptor = "(Lclient!xo;)V", line = 102)
	public Class117_Sub1(@OriginalArg(0) Class650 arg0) {
		@Pc(37) Iterator local37 = arg0.aHashMap13.keySet().iterator();
		@Pc(44) Class501 local44;
		while (local37.hasNext()) {
			local44 = (Class501) local37.next();
			this.aHashMap2.put(local44, new Class485[(Integer) arg0.aHashMap13.get(local44)]);
		}
		local37 = this.aHashMap2.keySet().iterator();
		while (local37.hasNext()) {
			local44 = (Class501) local37.next();
			@Pc(76) Class485[] local76 = (Class485[]) this.aHashMap2.get(local44);
			for (@Pc(78) int local78 = 0; local78 < local76.length; local78++) {
				@Pc(87) Class288 local87 = new Class288(2.0F);
				local87.method26815(0, Class393.aClass393_4, Class397.aClass397_3, 2);
				local76[local78] = new Class485(local44, 8192, 3, local87, this);
			}
		}
		@Pc(114) Class568 local114 = new Class568(this, 44100.0F, 32768);
		@Pc(121) Class568 local121 = new Class568(this, 22050.0F, 16384);
		this.aList1.add(local114);
		this.aList1.add(local121);
		this.aThread1 = new Thread(this.aRunnable2);
		this.aThread2 = new Thread(this.aRunnable3);
		this.aThread1.setPriority(10);
		this.aThread2.setPriority(10);
		this.aThread1.start();
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ahe", name = "p", descriptor = "(I)V", line = 138)
	@Override
	public void method10879() {
		if (this.aClass379_1 != null) {
			this.aClass379_1.method28301();
		}
		@Pc(12) Iterator local12 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(26) Class485[] local26;
			@Pc(69) int local69;
			@Pc(62) byte local62;
			do {
				if (!local12.hasNext()) {
					return;
				}
				@Pc(19) Class501 local19 = (Class501) local12.next();
				local26 = (Class485[]) this.aHashMap2.get(local19);
				if (!local19.aBoolean770) {
					@Pc(31) boolean local31 = false;
					for (@Pc(33) int local33 = 0; local33 < local26.length; local33++) {
						local26[local33].method29908();
						local31 |= local26[local33].method29904();
					}
					if (local31) {
						Arrays.sort(local26, new Class552(this));
					}
				}
				local62 = 6;
				@Pc(64) boolean local64 = false;
				local69 = local26.length - 1;
				while (!local64) {
					@Pc(78) float local78 = local26[local69].method29897();
					@Pc(84) Class491 local84 = local26[local69].method29861();
					if (local78 >= 0.0F) {
						local64 = true;
					} else if (local84 == Class491.aClass491_3 || local84 == Class491.aClass491_4 || local84 == Class491.aClass491_5) {
						local26[local69].method29887();
					}
					local69--;
					if (local69 < 0) {
						local64 = true;
					}
				}
			} while (local69 < local26.length - local62);
			while (local69 >= local26.length - local62) {
				@Pc(129) Class491 local129 = local26[local69].method29861();
				if (local129 == Class491.aClass491_3) {
					local26[local69].method29887();
				}
				local69--;
			}
		}
	}

	@OriginalMember(owner = "client!ahe", name = "d", descriptor = "()V", line = 138)
	@Override
	public void method10885() {
		if (this.aClass379_1 != null) {
			this.aClass379_1.method28301();
		}
		@Pc(12) Iterator local12 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(26) Class485[] local26;
			@Pc(69) int local69;
			@Pc(62) byte local62;
			do {
				if (!local12.hasNext()) {
					return;
				}
				@Pc(19) Class501 local19 = (Class501) local12.next();
				local26 = (Class485[]) this.aHashMap2.get(local19);
				if (!local19.aBoolean770) {
					@Pc(31) boolean local31 = false;
					for (@Pc(33) int local33 = 0; local33 < local26.length; local33++) {
						local26[local33].method29908();
						local31 |= local26[local33].method29904();
					}
					if (local31) {
						Arrays.sort(local26, new Class552(this));
					}
				}
				local62 = 6;
				@Pc(64) boolean local64 = false;
				local69 = local26.length - 1;
				while (!local64) {
					@Pc(78) float local78 = local26[local69].method29897();
					@Pc(84) Class491 local84 = local26[local69].method29861();
					if (local78 >= 0.0F) {
						local64 = true;
					} else if (local84 == Class491.aClass491_3 || local84 == Class491.aClass491_4 || local84 == Class491.aClass491_5) {
						local26[local69].method29887();
					}
					local69--;
					if (local69 < 0) {
						local64 = true;
					}
				}
			} while (local69 < local26.length - local62);
			while (local69 >= local26.length - local62) {
				@Pc(129) Class491 local129 = local26[local69].method29861();
				if (local129 == Class491.aClass491_3) {
					local26[local69].method29887();
				}
				local69--;
			}
		}
	}

	@OriginalMember(owner = "client!ahe", name = "s", descriptor = "()V", line = 138)
	@Override
	public void method10902() {
		if (this.aClass379_1 != null) {
			this.aClass379_1.method28301();
		}
		@Pc(12) Iterator local12 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(26) Class485[] local26;
			@Pc(69) int local69;
			@Pc(62) byte local62;
			do {
				if (!local12.hasNext()) {
					return;
				}
				@Pc(19) Class501 local19 = (Class501) local12.next();
				local26 = (Class485[]) this.aHashMap2.get(local19);
				if (!local19.aBoolean770) {
					@Pc(31) boolean local31 = false;
					for (@Pc(33) int local33 = 0; local33 < local26.length; local33++) {
						local26[local33].method29908();
						local31 |= local26[local33].method29904();
					}
					if (local31) {
						Arrays.sort(local26, new Class552(this));
					}
				}
				local62 = 6;
				@Pc(64) boolean local64 = false;
				local69 = local26.length - 1;
				while (!local64) {
					@Pc(78) float local78 = local26[local69].method29897();
					@Pc(84) Class491 local84 = local26[local69].method29861();
					if (local78 >= 0.0F) {
						local64 = true;
					} else if (local84 == Class491.aClass491_3 || local84 == Class491.aClass491_4 || local84 == Class491.aClass491_5) {
						local26[local69].method29887();
					}
					local69--;
					if (local69 < 0) {
						local64 = true;
					}
				}
			} while (local69 < local26.length - local62);
			while (local69 >= local26.length - local62) {
				@Pc(129) Class491 local129 = local26[local69].method29861();
				if (local129 == Class491.aClass491_3) {
					local26[local69].method29887();
				}
				local69--;
			}
		}
	}

	@OriginalMember(owner = "client!ahe", name = "y", descriptor = "(Ljava/lang/Object;I)I", line = 198)
	@Override
	public int method10877(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return 0;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			return local7.method31336();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "r", descriptor = "(Ljava/lang/Object;)I", line = 198)
	@Override
	public int method10894(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return 0;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			return local7.method31336();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "g", descriptor = "(Ljava/lang/Object;)I", line = 198)
	@Override
	public int method10896(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return 0;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			return local7.method31336();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "z", descriptor = "(Ljava/lang/Object;)I", line = 198)
	@Override
	public int method10873(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return 0;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			return local7.method31336();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "au", descriptor = "(FB)Lclient!tz;", line = 208)
	Class568 method10182(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class568 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class568 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class568) local9.next();
				local19 = local16.aFloat312;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "ar", descriptor = "(F)Lclient!tz;", line = 208)
	Class568 method10183(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class568 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class568 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class568) local9.next();
				local19 = local16.aFloat312;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "i", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;", line = 227)
	@Override
	public Object method10882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class568 local7 = this.method10182(arg5 * (float) arg1);
		@Pc(43) Class564 local43 = new Class564(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4593 * -1204190425, arg0 < 2 ? 2 : arg0, Class393.aClass393_4 == arg2 || arg2 == Class393.aClass393_5, Class397.aClass397_2 == arg3);
		@Pc(47) Class568 local47 = local43.aClass568_1;
		synchronized (local43.aClass568_1) {
			local43.aClass568_1.method31405(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "k", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;", line = 227)
	@Override
	public Object method10888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class568 local7 = this.method10182(arg5 * (float) arg1);
		@Pc(43) Class564 local43 = new Class564(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4593 * -1204190425, arg0 < 2 ? 2 : arg0, Class393.aClass393_4 == arg2 || arg2 == Class393.aClass393_5, Class397.aClass397_2 == arg3);
		@Pc(47) Class568 local47 = local43.aClass568_1;
		synchronized (local43.aClass568_1) {
			local43.aClass568_1.method31405(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "j", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;", line = 227)
	@Override
	public Object method10886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class568 local7 = this.method10182(arg5 * (float) arg1);
		@Pc(43) Class564 local43 = new Class564(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4593 * -1204190425, arg0 < 2 ? 2 : arg0, Class393.aClass393_4 == arg2 || arg2 == Class393.aClass393_5, Class397.aClass397_2 == arg3);
		@Pc(47) Class568 local47 = local43.aClass568_1;
		synchronized (local43.aClass568_1) {
			local43.aClass568_1.method31405(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "c", descriptor = "(IILclient!ma;Lclient!mf;IFI)Ljava/lang/Object;", line = 227)
	@Override
	public Object method10872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class568 local7 = this.method10182(arg5 * (float) arg1);
		@Pc(43) Class564 local43 = new Class564(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4593 * -1204190425, arg0 < 2 ? 2 : arg0, Class393.aClass393_4 == arg2 || arg2 == Class393.aClass393_5, Class397.aClass397_2 == arg3);
		@Pc(47) Class568 local47 = local43.aClass568_1;
		synchronized (local43.aClass568_1) {
			local43.aClass568_1.method31405(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "v", descriptor = "(Ljava/lang/Object;I)V", line = 236)
	@Override
	public void method10884(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			local7.aClass568_1.method31407(local7);
		}
	}

	@OriginalMember(owner = "client!ahe", name = "u", descriptor = "(Ljava/lang/Object;)V", line = 236)
	@Override
	public void method10889(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			local7.aClass568_1.method31407(local7);
		}
	}

	@OriginalMember(owner = "client!ahe", name = "f", descriptor = "(Ljava/lang/Object;[BII)V", line = 245)
	@Override
	public void method10891(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			local7.method31334(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ahe", name = "l", descriptor = "(Ljava/lang/Object;[BIIB)V", line = 245)
	@Override
	public void method10876(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			local7.method31334(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ahe", name = "e", descriptor = "(Ljava/lang/Object;[BII)V", line = 245)
	@Override
	public void method10890(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class564)) {
			return;
		}
		@Pc(7) Class564 local7 = (Class564) arg0;
		@Pc(11) Class568 local11 = local7.aClass568_1;
		synchronized (local7.aClass568_1) {
			local7.method31334(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ahe", name = "a", descriptor = "(Lclient!qy;)Lclient!qe;", line = 254)
	@Override
	public Class485 method10895(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class485 local27 = local11[local19];
				@Pc(31) Class491 local31 = local27.method29861();
				if (Class491.aClass491_7 == local31) {
					local27.method29867();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "w", descriptor = "(Lclient!qy;I)Lclient!qe;", line = 254)
	@Override
	public Class485 method10878(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class485 local27 = local11[local19];
				@Pc(31) Class491 local31 = local27.method29861();
				if (Class491.aClass491_7 == local31) {
					local27.method29867();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "n", descriptor = "(Lclient!qy;)Lclient!qe;", line = 254)
	@Override
	public Class485 method10887(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class485 local27 = local11[local19];
				@Pc(31) Class491 local31 = local27.method29861();
				if (Class491.aClass491_7 == local31) {
					local27.method29867();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "o", descriptor = "(Lclient!qy;)Lclient!qe;", line = 254)
	@Override
	public Class485 method10892(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class485 local27 = local11[local19];
				@Pc(31) Class491 local31 = local27.method29861();
				if (Class491.aClass491_7 == local31) {
					local27.method29867();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "b", descriptor = "(Lclient!qy;)Lclient!qe;", line = 254)
	@Override
	public Class485 method10893(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(27) Class485 local27 = local11[local19];
				@Pc(31) Class491 local31 = local27.method29861();
				if (Class491.aClass491_7 == local31) {
					local27.method29867();
					return local27;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "t", descriptor = "(Lclient!mh;I)Ljava/lang/Object;", line = 270)
	@Override
	Object method10875(@OriginalArg(0) Class399 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ahe", name = "m", descriptor = "(Lclient!mh;)Ljava/lang/Object;", line = 270)
	@Override
	Object method10883(@OriginalArg(0) Class399 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ahe", name = "h", descriptor = "(Lclient!mh;)Ljava/lang/Object;", line = 270)
	@Override
	Object method10897(@OriginalArg(0) Class399 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ahe", name = "q", descriptor = "(B)Lclient!ll;", line = 274)
	@Override
	public Class379 method10880() {
		return this.aClass379_1;
	}

	@OriginalMember(owner = "client!ahe", name = "ao", descriptor = "()Lclient!ll;", line = 274)
	@Override
	public Class379 method10874() {
		return this.aClass379_1;
	}

	@OriginalMember(owner = "client!ahe", name = "x", descriptor = "(I)V", line = 278)
	@Override
	public void method10881() {
		@Pc(3) HashMap local3 = this.method10181();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class501 local18 = (Class501) local11.next();
				@Pc(24) Class485[] local24 = (Class485[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method29861() != Class491.aClass491_7) {
						local24[local26].method29887();
						local24[local26].method29871();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class501 local79 = (Class501) local72.next();
					@Pc(85) Class485[] local85 = (Class485[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method29861() != Class491.aClass491_7) {
							local85[local87].method29908();
							local60 = false;
						}
					}
				}
			}
			Class281.method26679(10L);
		}
		this.aBoolean208 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "aj", descriptor = "()V", line = 278)
	@Override
	public void method10898() {
		@Pc(3) HashMap local3 = this.method10181();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class501 local18 = (Class501) local11.next();
				@Pc(24) Class485[] local24 = (Class485[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method29861() != Class491.aClass491_7) {
						local24[local26].method29887();
						local24[local26].method29871();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class501 local79 = (Class501) local72.next();
					@Pc(85) Class485[] local85 = (Class485[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method29861() != Class491.aClass491_7) {
							local85[local87].method29908();
							local60 = false;
						}
					}
				}
			}
			Class281.method26679(10L);
		}
		this.aBoolean208 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "ai", descriptor = "()V", line = 278)
	@Override
	public void method10899() {
		@Pc(3) HashMap local3 = this.method10181();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class501 local18 = (Class501) local11.next();
				@Pc(24) Class485[] local24 = (Class485[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method29861() != Class491.aClass491_7) {
						local24[local26].method29887();
						local24[local26].method29871();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class501 local79 = (Class501) local72.next();
					@Pc(85) Class485[] local85 = (Class485[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method29861() != Class491.aClass491_7) {
							local85[local87].method29908();
							local60 = false;
						}
					}
				}
			}
			Class281.method26679(10L);
		}
		this.aBoolean208 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "ag", descriptor = "()V", line = 278)
	@Override
	public void method10900() {
		@Pc(3) HashMap local3 = this.method10181();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class501 local18 = (Class501) local11.next();
				@Pc(24) Class485[] local24 = (Class485[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method29861() != Class491.aClass491_7) {
						local24[local26].method29887();
						local24[local26].method29871();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class501 local79 = (Class501) local72.next();
					@Pc(85) Class485[] local85 = (Class485[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method29861() != Class491.aClass491_7) {
							local85[local87].method29908();
							local60 = false;
						}
					}
				}
			}
			Class281.method26679(10L);
		}
		this.aBoolean208 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "al", descriptor = "()V", line = 278)
	@Override
	public void method10901() {
		@Pc(3) HashMap local3 = this.method10181();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class501 local18 = (Class501) local11.next();
				@Pc(24) Class485[] local24 = (Class485[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method29861() != Class491.aClass491_7) {
						local24[local26].method29887();
						local24[local26].method29871();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class501 local79 = (Class501) local72.next();
					@Pc(85) Class485[] local85 = (Class485[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method29861() != Class491.aClass491_7) {
							local85[local87].method29908();
							local60 = false;
						}
					}
				}
			}
			Class281.method26679(10L);
		}
		this.aBoolean208 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahe", name = "ard", descriptor = "(Lclient!yf;B)V", line = 12447)
	static final void method10184(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub32_1.method16020();
	}
}
