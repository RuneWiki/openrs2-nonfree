package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahx")
public class Class117_Sub2 extends Class117 {

	@OriginalMember(owner = "client!ahx", name = "p", descriptor = "F")
	static final float aFloat144 = 2.0F;

	@OriginalMember(owner = "client!ahx", name = "l", descriptor = "Z")
	volatile boolean aBoolean221 = false;

	@OriginalMember(owner = "client!ahx", name = "t", descriptor = "J")
	long aLong43 = Class280.method26667() * 3905997843429494375L;

	@OriginalMember(owner = "client!ahx", name = "q", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable5 = new Class197(this);

	@OriginalMember(owner = "client!ahx", name = "x", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable4 = new Class199(this);

	@OriginalMember(owner = "client!ahx", name = "v", descriptor = "Lclient!ll;")
	Class379 aClass379_2 = new Class379(this);

	@OriginalMember(owner = "client!ahx", name = "c", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap3 = new HashMap();

	@OriginalMember(owner = "client!ahx", name = "y", descriptor = "Ljava/lang/Thread;")
	Thread aThread3;

	@OriginalMember(owner = "client!ahx", name = "w", descriptor = "Ljava/lang/Thread;")
	Thread aThread4;

	@OriginalMember(owner = "client!ahx", name = "ak", descriptor = "(B)Ljava/util/HashMap;", line = 78)
	HashMap method10903() {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!ahx", name = "au", descriptor = "()Ljava/util/HashMap;", line = 78)
	HashMap method10904() {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!ahx", name = "ax", descriptor = "()Ljava/util/HashMap;", line = 78)
	HashMap method10905() {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!ahx", name = "<init>", descriptor = "(Lclient!xo;)V", line = 81)
	public Class117_Sub2(@OriginalArg(0) Class650 arg0) {
		@Pc(38) Iterator local38 = arg0.aHashMap13.keySet().iterator();
		@Pc(45) Class501 local45;
		while (local38.hasNext()) {
			local45 = (Class501) local38.next();
			this.aHashMap3.put(local45, new Class485[(Integer) arg0.aHashMap13.get(local45)]);
		}
		local38 = this.aHashMap3.keySet().iterator();
		while (local38.hasNext()) {
			local45 = (Class501) local38.next();
			@Pc(77) Class485[] local77 = (Class485[]) this.aHashMap3.get(local45);
			for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
				@Pc(88) Class288 local88 = new Class288(2.0F);
				local88.method26815(0, Class393.aClass393_4, Class397.aClass397_3, 2);
				local77[local79] = new Class485(local45, 32768, 3, local88, this);
			}
		}
		this.aThread3 = new Thread(this.aRunnable4);
		this.aThread4 = new Thread(this.aRunnable5);
		this.aThread3.setPriority(1);
		this.aThread4.setPriority(1);
		this.aThread3.start();
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!ahx", name = "d", descriptor = "()V", line = 112)
	@Override
	public void method10885() {
		if (this.aClass379_2 != null) {
			this.aClass379_2.method28301();
		}
		@Pc(11) Iterator local11 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(25) Class485[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class501 local18 = (Class501) local11.next();
				local25 = (Class485[]) this.aHashMap3.get(local18);
				if (!local18.aBoolean770) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method29908();
						local30 |= local25[local32].method29904();
					}
					if (local30) {
						Arrays.sort(local25, new Class196(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(76) float local76 = local25[local68].method29897();
					@Pc(82) Class491 local82 = local25[local68].method29861();
					if (local76 >= 0.0F) {
						local63 = true;
					} else if (local82 == Class491.aClass491_3 || Class491.aClass491_4 == local82 || Class491.aClass491_5 == local82) {
						local25[local68].method29887();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(127) Class491 local127 = local25[local68].method29861();
				if (Class491.aClass491_3 == local127) {
					local25[local68].method29887();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!ahx", name = "s", descriptor = "()V", line = 112)
	@Override
	public void method10902() {
		if (this.aClass379_2 != null) {
			this.aClass379_2.method28301();
		}
		@Pc(11) Iterator local11 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(25) Class485[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class501 local18 = (Class501) local11.next();
				local25 = (Class485[]) this.aHashMap3.get(local18);
				if (!local18.aBoolean770) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method29908();
						local30 |= local25[local32].method29904();
					}
					if (local30) {
						Arrays.sort(local25, new Class196(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(76) float local76 = local25[local68].method29897();
					@Pc(82) Class491 local82 = local25[local68].method29861();
					if (local76 >= 0.0F) {
						local63 = true;
					} else if (local82 == Class491.aClass491_3 || Class491.aClass491_4 == local82 || Class491.aClass491_5 == local82) {
						local25[local68].method29887();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(127) Class491 local127 = local25[local68].method29861();
				if (Class491.aClass491_3 == local127) {
					local25[local68].method29887();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!ahx", name = "p", descriptor = "(I)V", line = 112)
	@Override
	public void method10879() {
		if (this.aClass379_2 != null) {
			this.aClass379_2.method28301();
		}
		@Pc(11) Iterator local11 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(25) Class485[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class501 local18 = (Class501) local11.next();
				local25 = (Class485[]) this.aHashMap3.get(local18);
				if (!local18.aBoolean770) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method29908();
						local30 |= local25[local32].method29904();
					}
					if (local30) {
						Arrays.sort(local25, new Class196(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(76) float local76 = local25[local68].method29897();
					@Pc(82) Class491 local82 = local25[local68].method29861();
					if (local76 >= 0.0F) {
						local63 = true;
					} else if (local82 == Class491.aClass491_3 || Class491.aClass491_4 == local82 || Class491.aClass491_5 == local82) {
						local25[local68].method29887();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(127) Class491 local127 = local25[local68].method29861();
				if (Class491.aClass491_3 == local127) {
					local25[local68].method29887();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!ahx", name = "y", descriptor = "(Ljava/lang/Object;I)I", line = 172)
	@Override
	public int method10877(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong43 * 6440050160333401431L) / 1000.0F));
		this.aLong43 = local2 * 3905997843429494375L;
		return local15;
	}

	@OriginalMember(owner = "client!ahx", name = "r", descriptor = "(Ljava/lang/Object;)I", line = 172)
	@Override
	public int method10894(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong43 * 6440050160333401431L) / 1000.0F));
		this.aLong43 = local2 * 3905997843429494375L;
		return local15;
	}

	@OriginalMember(owner = "client!ahx", name = "g", descriptor = "(Ljava/lang/Object;)I", line = 172)
	@Override
	public int method10896(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong43 * 6440050160333401431L) / 1000.0F));
		this.aLong43 = local2 * 3905997843429494375L;
		return local15;
	}

	@OriginalMember(owner = "client!ahx", name = "z", descriptor = "(Ljava/lang/Object;)I", line = 172)
	@Override
	public int method10873(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong43 * 6440050160333401431L) / 1000.0F));
		this.aLong43 = local2 * 3905997843429494375L;
		return local15;
	}

	@OriginalMember(owner = "client!ahx", name = "c", descriptor = "(IILclient!ma;Lclient!mf;IFI)Ljava/lang/Object;", line = 179)
	@Override
	public Object method10872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!ahx", name = "i", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;", line = 179)
	@Override
	public Object method10882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!ahx", name = "j", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;", line = 179)
	@Override
	public Object method10886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!ahx", name = "k", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;", line = 179)
	@Override
	public Object method10888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!ahx", name = "v", descriptor = "(Ljava/lang/Object;I)V", line = 182)
	@Override
	public void method10884(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!ahx", name = "u", descriptor = "(Ljava/lang/Object;)V", line = 182)
	@Override
	public void method10889(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!ahx", name = "e", descriptor = "(Ljava/lang/Object;[BII)V", line = 183)
	@Override
	public void method10890(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ahx", name = "f", descriptor = "(Ljava/lang/Object;[BII)V", line = 183)
	@Override
	public void method10891(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ahx", name = "l", descriptor = "(Ljava/lang/Object;[BIIB)V", line = 183)
	@Override
	public void method10876(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ahx", name = "o", descriptor = "(Lclient!qy;)Lclient!qe;", line = 186)
	@Override
	public Class485 method10892(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class485 local28 = local11[local20];
				@Pc(32) Class491 local32 = local28.method29861();
				if (local32 == Class491.aClass491_7) {
					local28.method29867();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahx", name = "b", descriptor = "(Lclient!qy;)Lclient!qe;", line = 186)
	@Override
	public Class485 method10893(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class485 local28 = local11[local20];
				@Pc(32) Class491 local32 = local28.method29861();
				if (local32 == Class491.aClass491_7) {
					local28.method29867();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahx", name = "w", descriptor = "(Lclient!qy;I)Lclient!qe;", line = 186)
	@Override
	public Class485 method10878(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class485 local28 = local11[local20];
				@Pc(32) Class491 local32 = local28.method29861();
				if (local32 == Class491.aClass491_7) {
					local28.method29867();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahx", name = "n", descriptor = "(Lclient!qy;)Lclient!qe;", line = 186)
	@Override
	public Class485 method10887(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class485 local28 = local11[local20];
				@Pc(32) Class491 local32 = local28.method29861();
				if (local32 == Class491.aClass491_7) {
					local28.method29867();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahx", name = "a", descriptor = "(Lclient!qy;)Lclient!qe;", line = 186)
	@Override
	public Class485 method10895(@OriginalArg(0) Class501 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class485[] local11 = (Class485[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class485 local28 = local11[local20];
				@Pc(32) Class491 local32 = local28.method29861();
				if (local32 == Class491.aClass491_7) {
					local28.method29867();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ahx", name = "t", descriptor = "(Lclient!mh;I)Ljava/lang/Object;", line = 202)
	@Override
	Object method10875(@OriginalArg(0) Class399 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ahx", name = "h", descriptor = "(Lclient!mh;)Ljava/lang/Object;", line = 202)
	@Override
	Object method10897(@OriginalArg(0) Class399 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ahx", name = "m", descriptor = "(Lclient!mh;)Ljava/lang/Object;", line = 202)
	@Override
	Object method10883(@OriginalArg(0) Class399 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ahx", name = "ao", descriptor = "()Lclient!ll;", line = 206)
	@Override
	public Class379 method10874() {
		return this.aClass379_2;
	}

	@OriginalMember(owner = "client!ahx", name = "q", descriptor = "(B)Lclient!ll;", line = 206)
	@Override
	public Class379 method10880() {
		return this.aClass379_2;
	}

	@OriginalMember(owner = "client!ahx", name = "x", descriptor = "(I)V", line = 210)
	@Override
	public void method10881() {
		@Pc(3) HashMap local3 = this.method10903();
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
		this.aBoolean221 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "aj", descriptor = "()V", line = 210)
	@Override
	public void method10898() {
		@Pc(3) HashMap local3 = this.method10903();
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
		this.aBoolean221 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "ai", descriptor = "()V", line = 210)
	@Override
	public void method10899() {
		@Pc(3) HashMap local3 = this.method10903();
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
		this.aBoolean221 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "ag", descriptor = "()V", line = 210)
	@Override
	public void method10900() {
		@Pc(3) HashMap local3 = this.method10903();
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
		this.aBoolean221 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ahx", name = "al", descriptor = "()V", line = 210)
	@Override
	public void method10901() {
		@Pc(3) HashMap local3 = this.method10903();
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
		this.aBoolean221 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}
}
