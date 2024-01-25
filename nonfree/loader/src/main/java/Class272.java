import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
public final class Class272 {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "()V")
	public Class272() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Z)[I")
	public int[] method6629() {
		@Pc(8) DisplayMode[] local8 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(14) int[] local14 = new int[local8.length << 2];
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			local14[local16 << 2] = local8[local16].getWidth();
			local14[(local16 << 2) + 1] = local8[local16].getHeight();
			local14[(local16 << 2) + 2] = local8[local16].getBitDepth();
			local14[(local16 << 2) + 3] = local8[local16].getRefreshRate();
		}
		return local14;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	private void method6630(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(23) boolean local23 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local23) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(61) Field local61 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local61.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(68) Throwable local68) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(IILjava/awt/Frame;BII)V")
	public void method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method6630(arg2);
		if (arg0 == 0) {
			@Pc(39) int local39 = this.aDisplayMode1.getRefreshRate();
			@Pc(43) DisplayMode[] local43 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(45) boolean local45 = false;
			for (@Pc(47) int local47 = 0; local47 < local43.length; local47++) {
				if (arg4 == local43[local47].getWidth() && local43[local47].getHeight() == arg3 && local43[local47].getBitDepth() == arg1) {
					@Pc(75) int local75 = local43[local47].getRefreshRate();
					if (!local45 || Math.abs(local75 - local39) < Math.abs(arg0 - local39)) {
						local45 = true;
						arg0 = local75;
					}
				}
			}
			if (!local45) {
				arg0 = local39;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg3, arg1, arg0));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(I)V")
	public void method6632() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6630(null);
	}
}
