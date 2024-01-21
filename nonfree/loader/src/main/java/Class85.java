import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!jb")
public final class Class85 implements Runnable {

	@OriginalMember(owner = "loader!jb", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!jb", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!jb", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!jb", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!jb", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!jb", name = "l", descriptor = "I")
	private static final int anInt3036 = 1;

	@OriginalMember(owner = "loader!jb", name = "c", descriptor = "[Lloader!ia;")
	private Class84[] aClass84Array1;

	@OriginalMember(owner = "loader!jb", name = "o", descriptor = "Lloader!od;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!jb", name = "f", descriptor = "Lloader!ia;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "loader!jb", name = "d", descriptor = "I")
	private int anInt3035 = 0;

	@OriginalMember(owner = "loader!jb", name = "e", descriptor = "Lloader!ia;")
	private Class84 aClass84_1 = null;

	@OriginalMember(owner = "loader!jb", name = "b", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!jb", name = "a", descriptor = "Lloader!he;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!jb", name = "j", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!jb", name = "m", descriptor = "Lloader!he;")
	private Class83 aClass83_3 = null;

	@OriginalMember(owner = "loader!jb", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!jb", name = "i", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "loader!jb", name = "s", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!jb", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!jb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class85(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet2 = arg1;
		aString7 = "1.1";
		aString8 = "Unknown";
		try {
			aString8 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(71) Throwable local71) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.method2160(arg2, arg4, arg3);
		this.aBoolean129 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!jb", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method2160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(33) String[] local33 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(68) String[] local68 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(70) boolean local70 = false;
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(79) int local79 = 0; local79 < local33.length; local79++) {
				for (@Pc(85) int local85 = 0; local85 < local68.length; local85++) {
					try {
						@Pc(97) String local97 = local68[local85];
						if (local97.length() > 0 && !(new File(local97)).exists()) {
							continue;
						}
						@Pc(122) File local122 = new File(local97 + local33[local79]);
						@Pc(131) boolean local131;
						if (local72 == 1 && !local122.exists()) {
							local131 = local122.mkdir();
							if (!local131) {
								continue;
							}
						}
						@Pc(157) int local157;
						@Pc(142) File local142;
						if (!local70) {
							try {
								local142 = new File(local122, "uid.dat");
								if (local72 == 1 && (!local142.exists() || local142.length() < 4L)) {
									local157 = -1;
									@Pc(161) Random local161 = new Random();
									while (local157 == -1) {
										local157 = local161.nextInt();
									}
									@Pc(176) DataOutputStream local176 = new DataOutputStream(new FileOutputStream(local142));
									local176.writeInt(local157);
									local176.close();
								}
								if (local142.exists()) {
									@Pc(193) DataInputStream local193 = new DataInputStream(new FileInputStream(local142));
									local70 = true;
									this.anInt3035 = local193.readInt() + 1;
									local193.close();
								}
							} catch (@Pc(205) Exception local205) {
							}
						}
						if (this.aFile6 == null) {
							try {
								local122 = new File(local122, arg2);
								if (local72 == 1 && !local122.exists()) {
									local131 = local122.mkdir();
									if (!local131) {
										continue;
									}
								}
								local142 = new File(local122, "main_file_cache.dat2");
								if (local72 == 0 && !local142.exists()) {
									continue;
								}
								this.aClass84_1 = new Class84(local142, "rw", 52428800L);
								this.aClass84Array1 = new Class84[16];
								for (local157 = 0; local157 < 16; local157++) {
									this.aClass84Array1[local157] = new Class84(new File(local122, "main_file_cache.idx" + local157), "rw", 1048576L);
								}
								this.aClass84_2 = new Class84(new File(local122, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local122;
							} catch (@Pc(306) Exception local306) {
								try {
									this.aClass84_1.method2155();
									for (local157 = 0; local157 < 16; local157++) {
										this.aClass84Array1[local157].method2155();
									}
									this.aClass84_2.method2155();
								} catch (@Pc(329) Exception local329) {
								}
								this.aClass84Array1 = null;
								this.aClass84_1 = this.aClass84_2 = null;
								this.aFile5 = this.aFile6 = null;
							}
						}
					} catch (@Pc(346) Exception local346) {
					}
					if (local70 && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class83 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean129) {
						return;
					}
					if (this.aClass83_3 != null) {
						local16 = this.aClass83_3;
						this.aClass83_3 = this.aClass83_3.aClass83_1;
						if (this.aClass83_3 == null) {
							this.aClass83_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt3033;
				if (local45 == 1) {
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject7), local16.anInt3032);
				} else if (local45 == 2) {
					@Pc(191) Thread local191 = new Thread((Runnable) local16.anObject7);
					local191.setDaemon(true);
					local191.start();
					local191.setPriority(local16.anInt3032);
					local16.anObject6 = local191;
				} else if (local45 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject7).openStream());
				} else {
					@Pc(68) Object[] local68;
					if (local45 == 8) {
						local68 = (Object[]) local16.anObject7;
						if (((Class) local68[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local68[0]).getDeclaredMethod((String) local68[1], (Class[]) local68[2]);
					} else if (local45 == 9) {
						local68 = (Object[]) local16.anObject7;
						if (((Class) local68[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local68[0]).getDeclaredField((String) local68[1]);
					} else if (local45 == 3) {
						@Pc(168) String local168 = (local16.anInt3032 >> 24 & 0xFF) + "." + (local16.anInt3032 >> 16 & 0xFF) + "." + (local16.anInt3032 >> 8 & 0xFF) + "." + (local16.anInt3032 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local168).getHostName();
					}
				}
				local16.anInt3034 = 1;
			} catch (@Pc(220) ThreadDeath local220) {
				throw local220;
			} catch (@Pc(223) Throwable local223) {
				local16.anInt3034 = 2;
			}
		}
	}
}
