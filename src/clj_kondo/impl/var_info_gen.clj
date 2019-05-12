(ns clj-kondo.impl.var-info-gen
  "GENERATED, DO NOT EDIT. EXTRACTED FROM EASTWOOD WITH PERMISSION."
  {:no-doc true})
  (in-ns 'clj-kondo.impl.var-info)
  (def predicates '{clojure.core #{decimal? contains? every? satisfies? seq? fn? = vector? thread-bound? < char? some? future-done? pos? sequential? neg? reduced? float? set? <= reversible? bound? map? volatile? var? empty? string? map-entry? > associative? keyword? even? tagged-literal? extends? counted? future? zero? not-every? class? future-cancelled? sorted? nil? instance? record? identical? true? reader-conditional? >= integer? special-symbol? ratio? delay? ifn? chunked-seq? distinct? odd? false? list? == rational? realized? number? not-any? symbol? coll?}, clojure.string #{ends-with? starts-with? includes? blank?}, clojure.set #{superset? subset?}})
  (def clojure-core-syms '#{primitives-classnames +' decimal? restart-agent sort-by macroexpand ensure chunk-first eduction tree-seq unchecked-remainder-int seq reduce when-first find-ns get-thread-bindings contains? every? proxy-mappings keep-indexed cond->> subs ref-min-history set take-last bit-set reader-conditional gen-class qualified-keyword? while butlast satisfies? line-seq unchecked-subtract-int take-nth first re-groups seq? dec' ns-unmap println-str with-bindings* inst-ms iterator-seq iterate slurp newline short-array fn? doall prefers enumeration-seq dedupe pr-on dissoc atom import bit-shift-right print-method peek aget pvalues bound-fn mk-bound-fn vswap! last pr namespace push-thread-bindings bases = read+string dosync remove-ns take vector? thread-bound? send-via boolean bit-shift-left any? find-var rand-int aclone PrintWriter-on vreset! chunk dec future-call resultset-seq struct map juxt ns-publics < *source-path* with-loading-context test rest ex-data compile isa? boolean? .. munge delay set-error-mode! re-seq char? make-hierarchy set-agent-send-executor! swap-vals! keep char mapcat unchecked-long aset-long some? unchecked-negate remove-tap gen-interface *command-line-args* reverse inst? range sort -cache-protocol-fn unchecked-inc-int map-indexed with-bindings rand-nth comp await spit future-done? *read-eval* dorun simple-symbol? disj *2 eval cons refer print-dup -reset-methods floats pos? fnil merge-with nthrest load if-not *verbose-defrecords* sequential? *print-level* shuffle boolean-array find alength bit-xor deliver doseq unsigned-bit-shift-right neg? var-set unchecked-float pmap error-mode num reduced? disj! float? aset-float deftype bean booleans ns-unalias when-let int-array set? inc' cat StackTraceElement->vec flush take-while vary-meta <= alter -' if-some conj! repeatedly zipmap reset-vals! alter-var-root biginteger remove * re-pattern min pop! chunk-append prn-str with-precision format reversible? shutdown-agents conj bound? transduce lazy-seq *print-length* *file* compare-and-set! *use-context-classloader* await1 let ref-set pop-thread-bindings interleave printf map? -> defstruct *err* assert-same-protocol get doto identity into areduce long double volatile? definline nfirst meta find-protocol-impl bit-and-not *default-data-reader-fn* var? method-sig unchecked-add-int unquote-splicing hash-ordered-coll future reset-meta! cycle fn seque empty? short definterface add-tap filterv hash quot ns-aliases read unchecked-double key longs not= string? uri? aset-double unchecked-multiply-int chunk-rest pcalls *allow-unresolved-vars* remove-all-methods ns-resolve as-> aset-boolean trampoline double? when-not *1 vec *print-meta* when int map-entry? ns-refers rand second vector-of hash-combine > replace int? associative? unchecked-int set-error-handler! keyword? :source force bound-fn* namespace-munge group-by prn extend unchecked-multiply some->> default-data-readers ->VecSeq even? unchecked-dec tagged-literal? double-array in-ns create-ns re-matcher defn ref bigint extends? spread promise aset-char rseq ex-cause construct-proxy agent-errors *compile-files* ex-message *math-context* float pr-str concat aset-short set-agent-send-off-executor! ns mk-am symbol to-array-2d mod amap pop use unquote declare dissoc! reductions aset-byte indexed? ref-history-count - assoc! hash-set reduce-kv or cast reset! name ffirst sorted-set counted? byte-array tagged-literal println extend-type macroexpand-1 assoc-in char-name-string bit-test defmethod requiring-resolve EMPTY-NODE time memoize alter-meta! future? zero? simple-keyword? require unchecked-dec-int persistent! nnext add-watch not-every? class? rem agent-error some future-cancelled? memfn neg-int? struct-map drop *data-readers* nth sorted? nil? extend-protocol split-at *e load-reader random-sample cond-> dotimes select-keys bit-and bounded-count update list* reify update-in prefer-method aset-int *clojure-version* ensure-reduced *' instance? with-open mix-collection-hash re-find run! val defonce unchecked-add loaded-libs ->Vec bytes? not with-meta unreduced the-ns record? type identical? unchecked-divide-int ns-name max-key *unchecked-math* defn- *out* file-seq agent ns-map set-validator! ident? defprotocol swap! vals unchecked-subtract tap> *warn-on-reflection* sorted-set-by sync qualified-ident? assert *compile-path* true? release-pending-sends print empty remove-method *in* print-ctor letfn volatile! / read-line binding-conveyor-fn reader-conditional? bit-or clear-agent-errors vector proxy-super >= drop-last not-empty distinct partition loop add-classpath bit-flip long-array descendants merge accessor integer? mapv partition-all partition-by numerator object-array with-out-str condp derive load-string special-symbol? ancestors subseq error-handler gensym cond ratio? delay? intern print-simple flatten doubles halt-when with-in-str remove-watch ex-info ifn? some-> nat-int? proxy-name ns-interns all-ns find-protocol-method subvec for binding partial chunked-seq? find-keyword replicate min-key reduced char-escape-string re-matches array-map unchecked-byte with-local-vars ns-imports send-off defmacro every-pred keys rationalize load-file distinct? pos-int? extenders unchecked-short methods odd? ->ArrayChunk float-array *3 alias frequencies read-string proxy rsubseq inc get-method with-redefs uuid? bit-clear filter locking list + split-with aset ->VecNode keyword *ns* destructure *assert* defmulti chars str next hash-map if-let underive ref-max-history Throwable->map false? *print-readably* ints class some-fn case *flush-on-newline* to-array bigdec list? simple-ident? bit-not io! xml-seq byte max == *agent* lazy-cat comment parents count supers *fn-loader* sorted-map-by apply add-doc-and-meta interpose deref assoc rational? transient clojure-version chunk-cons comparator sorted-map send drop-while proxy-call-with-super realized? char-array resolve compare complement *compiler-options* *print-dup* defrecord with-redefs-fn sequence constantly get-proxy-class make-array shorts completing update-proxy unchecked-negate-int hash-unordered-coll repeat unchecked-inc nthnext and create-struct get-validator number? await-for chunk-next print-str not-any? into-array qualified-symbol? init-proxy chunk-buffer seqable? symbol? when-some unchecked-char ->> future-cancel var-get commute coll? get-in fnext denominator bytes gen-and-load-class refer-clojure})
  (def cljs-core-syms '#{js->clj unsafe-bit-and sort-by macroexpand chunk-first print-meta? m3-hash-int pr-str* eduction tree-seq unchecked-remainder-int uuid seq reduce when-first find-ns contains? every? keep-indexed cond->> subs set take-last bit-set import-macros qualified-keyword? while butlast satisfies? protocol-prefix unchecked-subtract-int take-nth first native-satisfies? seq? ns-unmap println-str inst-ms bool-expr iterate newline write-all adapt-ifn-params fn? doall keyword-identical? prefers dedupe dissoc atom import bit-shift-right peek aget iter mk-bound-fn specify vswap! last pr namespace obj-map type-hint-sigs = take vector? caching-hash boolean bit-shift-left random-uuid any? coercive-not rand-int aclone vreset! chunk elide-implicit-macro-args resolve-var dec unchecked-get map juxt ns-publics < variadic-fn? test rest ex-data this-as isa? boolean? .. munge delay re-seq char? make-hierarchy swap-vals! keep char mapcat unchecked-long some? unchecked-negate remove-tap symbol-identical? simple-benchmark reverse inst? range bit-count prepare-protocol-masks sort unchecked-inc-int map-indexed unchecked-set array-list js-str rand-nth comp array-chunk dispatch-fn bit-shift-right-zero-fill dorun implements? pr-sequential-writer simple-symbol? assert-valid-fdecl disj eval const? cons goog-define floats pos? specify! fnil merge-with nthrest if-not sequential? m3-mix-H1 prim-seq shuffle hash-keyword find build-positional-factory alength bit-xor doseq unsigned-bit-shift-right neg? adapt-ifn-invoke-params js-invoke m3-mix-K1 unchecked-float undefined? reduced? disj! float? deftype booleans mask build-map-factory when-let int-array set? iterable? cat divide flush coercive-boolean set-from-indexed-seq take-while vary-meta is_proto_ <= if-some conj! repeatedly zipmap reset-vals! remove * re-pattern min pop! chunk-append prn-str reversible? adapt-proto-params conj transduce lazy-seq js-delete truth_ array-index-of annotate-specs key->js compare-and-set! array-seq js-debugger let interleave print-map map? -> coercive-not= get doto identity into areduce long double volatile? nfirst meta emit-extend-protocol bit-and-not var? unchecked-add-int hash-ordered-coll reset-meta! do-rfn cycle fn empty? short add-tap filterv hash quot ns-interns* unchecked-double ranged-iterator key longs not= set-print-err-fn! string? uri? emit-defrecord string-expr es6-iterator pr-str-with-opts validate-impl-sigs js-arguments unchecked-multiply-int chunk-rest remove-all-methods as-> trampoline double? when-not vec when int multi-arity-fn map-entry? rand second find-ns-obj hash-combine > replace int? associative? unchecked-int js-keys keyword? array-iter :source force group-by ->impl-map js-obj* prn default-dispatch-val use-macros unchecked-multiply gen-apply-to some->> even? es6-iterator-seq unchecked-dec persistent-array-map-seq tagged-literal? double-array create-ns defn spread rseq ex-cause ex-message string-print float pr-str es6-set-entries-iterator concat js-in ns symbol es6-iterable to-array-2d ExceptionInfo mod amap pop type-hint-impl-map use declare dissoc! reductions indexed? - assoc! hash-set reduce-kv or reset! name ffirst sorted-set counted? tagged-literal println extend-type macroexpand-1 assoc-in bit-test defmethod time type-hint-single-arity-sig memoize alter-meta! zero? simple-keyword? require unchecked-dec-int persistent! set-print-fn! nnext add-watch not-every? rem ifind? proto-assign-impls some memfn neg-int? drop parse-impls js-obj nth sorted? nil? type-hint-first-arg extend-protocol split-at prn-str-with-opts random-sample cond-> dotimes select-keys bit-and bounded-count update find-macros-ns list* reify update-in prefer-method do-curried ensure-reduced instance? mix-collection-hash load-file* re-find run! val defonce unchecked-add transformer-iterator not with-meta unreduced record? type identical? collect-protocols unchecked-divide-int ns-name typed-expr? max-key defn- hash-string type-hint-multi-arity-sig set-validator! ident? defprotocol swap! vals unchecked-subtract tap> variadic-fn sorted-set-by cloneable? gen-apply-to-helper qualified-ident? hash-string* key-test ifn-invoke-methods assert true? array empty remove-method multi-arity-fn? letfn volatile! / bitpos bit-or m3-fmix vector adapt-obj-params >= drop-last object? not-empty distinct partition compatible? loop add-obj-methods bit-flip long-array descendants imul merge js-mod to-property integer? mapv infinite? partition-all partition-by variadic-fn* equiv-map object-array with-out-str condp derive seq-iter special-symbol? ancestors subseq gensym cond check-valid-options delay? flatten doubles add-proto-methods* halt-when remove-watch ex-info ifn? some-> nat-int? ns-interns subvec base-assign-impls for binding partial chunked-seq? replicate min-key reduced re-matches array-map unchecked-byte ns-imports defmacro every-pred keys missing-protocol load-file distinct? pos-int? unchecked-short methods odd? validate-fields frequencies reduceable? rsubseq inc type->str get-method with-redefs uuid? es6-entries-iterator bit-clear filter locking list + split-with aset int-rotate-left keyword destructure defmulti chars str next pr-seq-writer coercive-= regexp? hash-map *exec-tap-fn* gen-apply-to-simple if-let underive add-ifn-methods nil-iter false? ints some-fn case to-array list? array? simple-ident? exists? clone demunge bit-not byte max == lazy-cat comment parents warn-and-update-protocol count sorted-map-by apply add-to-string-hash-cache clj->js copy-arguments unsafe-cast interpose deref assoc transient chunk-cons comparator print-prefix-map type-hint-multi-arity-sigs sorted-map drop-while realized? resolve compare complement defrecord string-iter sequence constantly chunked-seq make-array shorts enable-console-print! completing unchecked-negate-int hash-unordered-coll simple-test-expr? repeat unchecked-inc nthnext and get-validator number? gen-apply-to-simple-helper assoc-test chunk-next print-str not-any? into-array qualified-symbol? js-comment chunk-buffer seqable? validate-impls symbol? m3-hash-unencoded-chars when-some unchecked-char require-macros system-time ->> js-inline-comment coll? get-in fnext dt->et bytes refer-clojure})
  