import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class268 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class268() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(B)V")
	public void method5994() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5997(null);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/awt/Frame;IZII)V")
	public void method5995(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5997(arg1);
		if (arg4 == 0) {
			@Pc(29) int local29 = this.aDisplayMode1.getRefreshRate();
			@Pc(33) DisplayMode[] local33 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < local33.length; local37++) {
				if (local33[local37].getWidth() == arg3 && arg0 == local33[local37].getHeight() && arg2 == local33[local37].getBitDepth()) {
					@Pc(65) int local65 = local33[local37].getRefreshRate();
					if (!local35 || Math.abs(local65 - local29) < Math.abs(arg4 - local29)) {
						local35 = true;
						arg4 = local65;
					}
				}
			}
			if (!local35) {
				arg4 = local29;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg0, arg2, arg4));
	}

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "(B)[I")
	public int[] method5996() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5997(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(10) Field local10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local10.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local10.get(this.aGraphicsDevice1);
			if (local20) {
				local1 = true;
				local10.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(32) Throwable local32) {
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
}
