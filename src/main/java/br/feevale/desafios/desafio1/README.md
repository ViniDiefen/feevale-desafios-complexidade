# A Conjectura de Goldbach

A conjectura de Goldbach foi apresentada por Christian Goldbach em uma carta a Leonhard Euler no ano de 1742, e diz:

> Todo número par maior do que dois pode ser representado pela soma de dois números primos.

Apesar de até hoje não ter sido provada, a conjectura funcionou para todos os casos que foram experimentados. Seu trabalho é levar adiante a conjectura.

Para isto, definimos o conjunto:

$$
G(n) = \{(p_1,p_2) \mid p_1 + p_2 = n,\ p_1 \text{ e } p_2 \text{ são primos com } p_1 \leq p_2\}
$$

Por exemplo, temos:

$$
G(6) = \{(3, 3)\}
$$

$$
G(12) = \{(5, 7)\}
$$

$$
G(26) = \{(3, 23), (7, 19), (13, 13)\}
$$

A partir disso, você deve escrever um algoritmo que determina quais os três números **n₁, n₂ e n₃**, entre **1.000.000 e 2.000.000**, para os quais os conjuntos $G(n_1)$, $G(n_2)$ e $G(n_3)$ têm o maior número de elementos.

> **Limite de tempo:** 1 minuto.
